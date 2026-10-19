param(
    [Parameter(Mandatory = $true)]
    [string]$SourceFile
)

$ErrorActionPreference = 'Stop'
$sourcePath = (Resolve-Path -LiteralPath $SourceFile).Path
if ([IO.Path]::GetExtension($sourcePath) -ne '.java') {
    throw 'Open the Java file containing main() before running the exercise.'
}

$sourceFolder = [IO.Path]::GetDirectoryName($sourcePath)
$sourceFiles = @(Get-ChildItem -LiteralPath $sourceFolder -Filter '*.java' -File |
    Select-Object -ExpandProperty FullName)
$sourceText = [IO.File]::ReadAllText($sourcePath)
$packageMatch = [regex]::Match($sourceText, '(?m)^\s*package\s+([\w.]+)\s*;')
$mainClass = [IO.Path]::GetFileNameWithoutExtension($sourcePath)
$sourceRoot = $sourceFolder
if ($packageMatch.Success) {
    $packageName = $packageMatch.Groups[1].Value
    $mainClass = $packageName + '.' + $mainClass
    $packageParts = $packageName.Split('.')
    for ($index = $packageParts.Length - 1; $index -ge 0; $index--) {
        if ((Split-Path -Path $sourceRoot -Leaf) -ne $packageParts[$index]) {
            $sourceRoot = Split-Path -Path $PSScriptRoot -Parent
            break
        }
        $sourceRoot = Split-Path -Path $sourceRoot -Parent
    }
}

$compiler = (Get-Command javac -CommandType Application -ErrorAction Stop).Source
$runtime = Join-Path (Split-Path -Path $compiler -Parent) 'java.exe'
$buildRoot = [IO.Path]::GetFullPath((Join-Path ([IO.Path]::GetTempPath()) 'pnpe-java-runs'))
$buildFolder = Join-Path $buildRoot ([Guid]::NewGuid().ToString('N'))
New-Item -ItemType Directory -Path $buildFolder -Force | Out-Null

Push-Location -LiteralPath $sourceFolder
try {
    & $compiler -encoding UTF-8 -sourcepath $sourceRoot -d $buildFolder @sourceFiles
    if ($LASTEXITCODE -ne 0) {
        exit $LASTEXITCODE
    }
    & $runtime -cp $buildFolder $mainClass
    $runExitCode = $LASTEXITCODE
}
finally {
    Pop-Location
    $resolvedBuildFolder = [IO.Path]::GetFullPath($buildFolder)
    if ((Split-Path -Path $resolvedBuildFolder -Parent) -eq $buildRoot) {
        Remove-Item -LiteralPath $resolvedBuildFolder -Recurse -Force
    }
}

exit $runExitCode
