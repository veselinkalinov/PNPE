
public class TryCatchExample3 {
	public static void main() {  
		try  
		{  
			System.out.println(50/0); //may throw exception
			// if exception occurs, the remaining statement will not exceute  
			System.out.println("rest of the code");  
		}  
		// handling the exception   
		catch(ArithmeticException e)  
		{  
			System.out.println(e);  
		}  
	}
}
