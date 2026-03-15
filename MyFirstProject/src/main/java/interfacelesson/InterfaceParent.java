package interfacelesson;

public interface InterfaceParent {
	
	public static final int ab= 5;
	int bk= 7;

	public abstract void display();
	
	default void displayTwo()
	{
		//ab= 6;  ( cannot assign)
		//bk= 90; ( cannot assign the same variable name )
		
		System.out.println(ab + bk);
		
	}
	
	public static void displayThree()
	{
		
		System.out.println("This is a Static Interface");
	}
	
}
