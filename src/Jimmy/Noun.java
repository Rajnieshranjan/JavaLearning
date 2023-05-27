package Jimmy;

public class Noun {
	//int i = 10;

	public void ProperNoun()
	{
		int i = 20;
		System.out.println("I am in Proper Noun");
		CommonNoun();
		System.out.println("After Proper Noun");
		System.out.println(i);
	}
	
	public static void CommonNoun() 
	{
		System.out.println("I am in Common Noun");
		//ImproperNoun();
	//	System.out.println(i);
	}
	
	public void ImproperNoun()
	{
		System.out.println("I am in Improper Noun");
		ProperNoun();
		System.out.println("After Improper Noun");
		//System.out.println(i);
	}

	public static void main(String[] args)
	{
		Noun n = new Noun();
		n.ImproperNoun();
//		n.ProperNoun();
//		CommonNoun();
	}
}
