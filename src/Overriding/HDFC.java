package Overriding;

public class HDFC extends RBI {
	
	public static void main (String[] args) {
		
		HDFC obj = new HDFC();
		System.out.println(obj.getHomeLoanROI());
		System.out.println(obj.getCarLoanROI());
	}
	public double getHomeLoanROI() {

		return 11;

}
public HDFC getObject(){
	HDFC obj= new HDFC();
	return obj;
	
}
}
