import java.io.*;  

public class TestThrow2 {   

	//function to check if person is eligible to vote or not   
	public static void method() throws IOException {

		try (FileReader file = new FileReader("C:\\abc.txt");
			 BufferedReader fileInput = new BufferedReader(file)) {
			fileInput.readLine();
		}

//		throw new FileNotFoundException();  

	}  
	//main method  
	public static void main(){  
		try  
		{  
			method();  
		}   
		catch (IOException e)
		{  
			e.printStackTrace();  
		}  
		System.out.println("rest of the code...");    
	}    
}    