package ExceptionHandling;

public class ArrayException {
	public static void main(String[] args) {

		System.out.println("Beginning");
		try{
			int i[]= new int[9];
					i[11]= 200;
					/*
					for(int j=0;j<i.length;j++)
					{
						System.out.println(i[j]);
					}
					*/
		}catch(Exception e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		System.out.println("Ending");
}
}