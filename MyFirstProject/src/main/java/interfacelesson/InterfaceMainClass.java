package interfacelesson;

public class InterfaceMainClass implements InterfaceParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceParent obj = new InterfaceMainClass();
		obj.display();
		obj.displayTwo();
		InterfaceParent.displayThree();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello Friends");
	}

	
}
