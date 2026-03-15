package abstraction;

public class ChildAbstract extends ParentAbstract {
	public void showing()
	{
		System.out.println("hiii");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAbstract obj = new ChildAbstract ();
		obj.displayAbstract();
		System.out.println(obj.nameAbstract("Parthiv"));
		obj.sum();
		ChildAbstract obj1 = new ChildAbstract();
		// child object has to create to call child class property.
		obj1.showing();
		
	}

	@Override
	public void displayAbstract() {
		// TODO Auto-generated method stub
		System.out.println("Hello Friends");
	}

	@Override
	public String nameAbstract(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
