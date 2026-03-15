package inheritance;

public class ChildClass extends SingleParent {

public void name()

{
	System.out.println( "Place - Kollam");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChildClass obj = new ChildClass();
obj.name();
obj.display();
obj.number();
SingleParent obj1 = new SingleParent();
obj1.display();
obj1.number();
//obj1.name ( not able to call the child class properties from parent class object creation)
	}
 
}
