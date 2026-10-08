
public class TryCatchExample7 {
	public static void main() {  

		try  
		{  
			System.out.println(50/0); //may throw exception

		}  
		// handling the exception  
		catch(Exception e)  
		{  
			System.out.println("Division by zero");
			// generating the exception in catch block  
			System.out.println(50/0); //may throw exception

		}  
		System.out.println("rest of the code");  
	}  
}
