package Jimmy;

public class Butterfly {
	
	public void larva(int i)
	{
		System.out.println(i+5);

	}
	
	public void pupa(int i, int j, String k)
	{
		System.out.println(i+""+j+" "+k);
	}
	
	
	public static void main(String[] args)
	{
		Butterfly a = new Butterfly();
		Butterfly b = new Butterfly();
		a.larva(0);
	
		
		
		a.larva(200);
		b.pupa(20,6, "is my BirthDay" );
	}
	

}
