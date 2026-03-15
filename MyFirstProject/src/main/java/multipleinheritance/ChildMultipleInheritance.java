package multipleinheritance;

public class ChildMultipleInheritance implements InterfaceOne, InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMultipleInheritance obj = new ChildMultipleInheritance();
		obj.diplay();
		obj.sumOfTwo();
		obj.displayTwo();
	}

	@Override
	public void sumOfTwo() {
		// TODO Auto-generated method stub
		int a =55;
		int b = 30;
		
		System.out.println( a+b);
	}

	@Override
	public void diplay() {
		// TODO Auto-generated method stub
		System.out.println( "Hello Friends");
	}

	@Override
	public void displayTwo() {
		// TODO Auto-generated method stub
		System.out.println("Override One");
		System.out.println("Override Two");
	}

}
