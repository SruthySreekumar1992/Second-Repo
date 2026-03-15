package accessmodifier;

public class Specifier {

public void displayPublic ()
{
	System.out.println("This is a public access specifier");
}

private void displayPrivate ()
{
	System.out.println("This is a private access specifier");
}

 void displayDefault ()
{
	System.out.println("this is a default access specifier");
}

protected void displayProtected ()
{
	System.out.println("this is a protected access specifier");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Specifier obj = new Specifier ();
		obj.displayPublic();
		obj.displayPrivate();
		obj.displayDefault();
		obj.displayProtected();
		
		
		
	}

}
