package polymorphism;

public class OverRidingChild extends OverRidingParent {

	public void display()
	{
		super.display();
		System.out.println("Friends");
	}
	public int value(int a, int b)
	{
		System.out.println(super.value(10, 7));
		int c = a-b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRidingChild obj = new OverRidingChild();
		obj.display();
		System.out.println(obj.value(10, 5));
		obj.age(3, 7);
		
	}
	@Override
	public void age(int a, int b) {
		int c = a-b;
		System.out.println(c);
		super.age(a, b);
	}

}
