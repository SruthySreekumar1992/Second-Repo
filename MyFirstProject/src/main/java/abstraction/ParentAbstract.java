package abstraction;

public abstract class ParentAbstract {

	public ParentAbstract ()
	{
		System.out.println("Non Parameterised Constructor ");
		
	}
	
	
public abstract void displayAbstract();

public abstract String nameAbstract(String name);

public void sum()
{
	int a = 2;
	int b = 4;
	int c = a+b;
	
	System.out.println(c);
}
}
