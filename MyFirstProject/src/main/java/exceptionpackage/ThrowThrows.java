package exceptionpackage;

public class ThrowThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 int age = 15;
 if (age > 18)
 {
	 System.out.println("elegible for voting");	 
 }
 else
 {
	throw new Exception ("Not Elegible");
	 
 }
	}

}
