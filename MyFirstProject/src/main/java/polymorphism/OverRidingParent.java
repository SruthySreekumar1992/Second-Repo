package polymorphism;

public class OverRidingParent {
	public void display()
	{
		
		System.out.println("hello");
	}
public int value(int a, int b)
{
	int c = a+b;
	return c;
}
public void age(int a, int b)
{
	System.out.println(a*b);
}
}
