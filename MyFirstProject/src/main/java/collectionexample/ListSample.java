package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		List <String> ab = new ArrayList <String>();
		
		System.out.println(ab);
		
		//Methods - 1) add method. (To add elements in the list)
		ab.add ("Colors");
		ab.add ("Blue");
		ab.add ("Blue");
		ab.add ("Green");
		ab.add ("Red");
		ab.add (null);
		ab.add (null);
		
		System.out.println(ab);
		
		// 2) indexOf ( to return the index of a particular element)
		
		System.out.println(ab.indexOf("Green"));
		System.out.println(ab.indexOf("Blue")); // if there is a repeated value, first value will return.
		
		// 3) lastIndexOf ( will return last occurance value)
		
		System.out.println(ab.lastIndexOf("Blue"));
		
		// 4) remove ( to remove a particular value according to the index position)
		
		System.out.println(ab.remove(5)); // index based
		System.out.println(ab);
		
		System.out.println(ab.remove(null)); // object based (returns boolean value (T/F))
		
		System.out.println(ab);
		
		// 5) get (to retrieve an element in a collection)
		
		System.out.println(ab.get(2));
		
		// 6)contains - (to check an element is present or not in the list. If yes - returns true, else false)
		
		System.out.println(ab.contains("Green"));
		
		//7) isEmpty - (to check weather list is empty or not)
		
		System.out.println(ab.isEmpty());
		
		//8) size ( to return the size or length of a list)
		
		System.out.println(ab.size());
		
		for (int i = 0;i < ab.size();i++)
		{
			System.out.println(ab.get(i));
			
		}
		
		for (String s : ab )
		{
			System.out.println();
			
		}
	}

}
