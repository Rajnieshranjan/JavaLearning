package ExceptionHandling;

public class TryandCatch {
	public static void main(String[] args) {
		System.out.println("Before try block");
		try {
			System.out.println("Beginning");
			
			int divide= 10/0;
			// catch function can be checked above syntax by dividing 10/5
			System.out.println(divide);
			System.out.println("Ending");
			
			}catch(Exception e) {
				System.out.println("Error occured");
				//System.out.println(e.getMessage());
				
				System.out.println("after try catch block");
			} 
			
	}

}
