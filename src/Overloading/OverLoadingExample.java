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
		System.out.println("ahsdsahd");
		return mobileNumber+password;
	}

	
	public static void main(int a, int b){
		System.out.println("intab");
		
		OverLoadingExample obj= new OverLoadingExample();
		System.out.println(obj.doLogin(123, 0));
		System.out.println(obj.add(3, 4));
		System.out.println(obj.add(4, 5, 6));
		System.out.println(obj.doLogin(455666, 7899000));
	}

	public static void main (String [] args) {

		OverLoadingExample obj= new OverLoadingExample();
		System.out.println(obj.doLogin(123, 0));
	System.out.println(obj.add(3, 4));
	System.out.println(obj.add(4, 5, 6));
		System.out.println(obj.doLogin(455666, 7899000));
		
		main(1,2,9);
		System.out.println(obj.doLogin(1, 1));
		
		
		System.out.println("ckjefhgyuadfbhadfygu");
	}
	public static void main (int a, int b, int c) {
		int d=a*b*c;
		System.out.println("intabcdef");
		
	}
}   