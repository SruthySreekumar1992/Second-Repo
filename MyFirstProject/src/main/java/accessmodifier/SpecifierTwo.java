package accessmodifier;

public class SpecifierTwo extends Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecifierTwo obj = new SpecifierTwo ();
		obj.displayPublic();
		obj.displayDefault();
		obj.displayProtected();
		//obj.displayPrivate(); ( not possible to access)
	}

}
