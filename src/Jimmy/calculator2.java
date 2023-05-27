package Jimmy;

public class calculator2{
	
	 int x = 115;
	 int y =4;
	 
	public static void main(String[] args) {
		calculator2 c = new calculator2();
		c.add();c.div();c.mul();c.sub();
		

	}
	
	public  void add() {
		
		System.out.println(x+y);
		 
	}
	
	public  void sub() {
		
		 System.out.println(x-y);
	}
	
	public  void mul() {
		 
		 System.out.println(x*y);
	}
	
	public  void div() {
		
		 System.out.println(x/y);
	}
	
	

}
