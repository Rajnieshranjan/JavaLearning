package Overloading;


public class OverLoadingExample {


	public int add(int a, int b){
		return a+b;
	}
	public int add (int a, int b, int c) {
		return a+b+c;
		
	}
	public String doLogin(String userName,String password) {
		return userName+password;
		
	}

	public int doLogin(int mobileNumber, int password) {
		return mobileNumber+password;
	}

	public static void main (String [] args) {

		OverLoadingExample obj= new OverLoadingExample();
		System.out.println(obj.doLogin(123, 0));
		System.out.println(obj.add(3, 4));
		System.out.println(obj.add(4, 5, 6));
		System.out.println(obj.doLogin(455666, 7899000));
	}
}   