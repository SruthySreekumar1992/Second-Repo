package exceptionpackage;

public class ExceptionMainClass {

	public static void main(String[] args){
	try
	{
    int a = 5;
    int b = 0;
    int c = a/b;
    
    System.out.println(c);
	}
	catch (ArithmeticException ab)
	{
		System.out.println("Exception handled");
		
	}
	 finally 
	 {
		 
		 System.out.println("Important code");
	 }
	
	System.out.println("exit");
		try
		{
	int ad [] = {3,4, 7, 8, };
		
		System.out.println(ad[4]);
		}
		 
		catch (ArrayIndexOutOfBoundsException xv)
		{
			System.out.println( "Exception handled for Array");
		}
	
		
		/*String jk = null;
		
		System.out.println(jk.length());*/
		
	}

}
