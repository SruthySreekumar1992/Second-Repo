package stringprogram;

public class BufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer ("hello");
		System.out.println(sb);
		StringBuilder sbs = new StringBuilder ("hiii");
		System.out.println(sbs);
		

	//insert- to add a new value or string based on the index position.
		
		System.out.println(sb.insert(5," Good Morning"));
		System.out.println(sb);
	
		//append- to add a string at the end.
		
		System.out.println(sb.append("new word"));
		
		//replace - to replace a word or character based on the index position.
		
		System.out.println(sb.replace(6, 10, "happy"));
		
		//delete - delete the string word according to the index position.
		
		System.out.println(sb.delete(6, 11));
		
		//reverse - to reverse the string.
		
		System.out.println(sb.reverse());
	}

}
