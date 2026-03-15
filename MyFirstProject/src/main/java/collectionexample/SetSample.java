package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> gk = new HashSet <String> ();
		
		gk.add("India");
		gk.add("Srilanka");
		gk.add("Europe");
		gk.add("Thailand");
		gk.add("India");
		gk.add(null);
		gk.add(null);
		
		 System.out.println(gk);
		 
		 System.out.println(gk.remove("Europe"));
		 
		 System.out.println(gk);
		 
		 //addAll, size, add, isEmpty, contains, containsAll
		 
		 gk.clear();
		 System.out.println(gk);
	}

}
