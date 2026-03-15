package accessspecifier;

import accessmodifier.Specifier;

public class SpecifierThree extends Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecifierThree obj = new SpecifierThree();
		obj.displayPublic();
		obj.displayProtected();
		Specifier obj1 = new Specifier ();
		obj1.displayPublic();
	}

}
