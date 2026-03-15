package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.CDATASection;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> ab = new ArrayList <String> ();
	
		ab.add("Apple");
		ab.add("Orange");
		ab.add("Grapes");
		ab.add("Lemon");
		System.out.println(ab);
		
		ArrayList <String> dc = new ArrayList <String> ();
		
		dc.add("Blue");
		dc.add("White");
		dc.add("Black");
		dc.add("Red");
		
		System.out.println(dc);
		
		//addAll (to add or combain 2 list)
		
		System.out.println(ab.addAll(dc));
		
		System.out.println(ab);
		
		//containsAll ( to check weather a list is present in another list)
		
		System.out.println(ab.containsAll(dc));
		System.out.println(dc.containsAll(ab));
		
		Iterator <String> cd = ab.iterator();
		
		while (cd.hasNext())
		{
			System.out.println(cd.next());
			
		}
		
		cd.remove();
		System.out.println(ab);
	}

}
