package polymorphism;

public class RevisionChild extends RevisionParent {
	
	public void display() 
	{ 
		super.display();
	 System.out.println("This is Child Class");	
	}

	@Override
	public void displayTwo(int a, int b) {
		// TODO Auto-generated method stub
		super.displayTwo(100, 100);
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevisionChild obj = new RevisionChild();
		obj.display();
		obj.displayTwo(20, 5);
	}

}
