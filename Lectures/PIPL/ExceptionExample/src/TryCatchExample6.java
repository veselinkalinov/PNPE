
public class TryCatchExample6 {
	public static void main() {  
		int i=50;  
		int j=0;  
		try  
		{  
			throw new ArithmeticException("/ by zero");
		}  
		// handling the exception  
		catch(Exception e)  
		{  
			// resolving the exception in catch block  
			System.out.println(i/(j+2));  
		}  
	}  
}
