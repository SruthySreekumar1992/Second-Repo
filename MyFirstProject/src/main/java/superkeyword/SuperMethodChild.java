package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	
	public void display(int a, int b)
	{
		this.display();
        System.out.println(super.Sum(3, 5));
		super.display(74);
		System.out.println(a+b);
	}
public void display()

{
	System.out.println("Kerala");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperMethodChild obj = new SuperMethodChild();
	//obj.display(5);	
	obj.display(4, 6);
	}

}
