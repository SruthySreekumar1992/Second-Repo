package superkeyword;

public class ConstructorChild extends ConstructorParent {
	
	public ConstructorChild ()
	{
		
		System.out.println("Friends");
	}
	public ConstructorChild (int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChild obj = new ConstructorChild();
		ConstructorChild obj1 = new ConstructorChild(3);
	}

}
