package inheritance;

public class MultilevelChild extends MultilevelIntermediate {
 
public void marks()
{
 System.out.println("Marks - 56");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultilevelChild obj = new MultilevelChild();
		obj.marks();
		obj.name();
		obj.place();
	}

}
