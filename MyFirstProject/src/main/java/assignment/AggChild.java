package assignment;

public class AggChild {

	String add;
	AggParent ref;
	public AggChild (String add,AggParent ref )
	{
		this.add = add;
		this.ref = ref;
	}
	
	public void display() 
	{
		System.out.println("Student Name : " + ref.name);
		System.out.println("Roll No : " + ref.roll);
		System.out.println("Address : " + add);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggParent obj1 = new AggParent ("PRANAV", 16);
		AggChild obj = new AggChild( "Pearl Apartments, S.K Street, Bangalore - 560040", obj1);
		obj.display();
	}

}
