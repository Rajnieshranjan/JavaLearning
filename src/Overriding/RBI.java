package Overriding;

public class RBI {
	
public double getHomeLoanROI() {

return 8.5;
}

public double getCarLoanROI() {
	return 10.5;
}
public RBI getObject() {
	RBI obj = new RBI();
	return obj;
	
}
}