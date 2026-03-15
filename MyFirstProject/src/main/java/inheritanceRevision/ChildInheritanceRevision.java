package inheritanceRevision;

public class ChildInheritanceRevision extends ParentInheritanceRevision
   {

	public void displayTwo() 
	{
		System.out.println("Hello Friends");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInheritanceRevision obj = new ChildInheritanceRevision();
		obj.displayTwo();
		obj.display();
		obj.sumOne();
	}

}
