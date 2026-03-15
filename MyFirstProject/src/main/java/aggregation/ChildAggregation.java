package aggregation;

public class ChildAggregation {

	String childName;
	int childMarks;
	ParentAggregation ref;
	
	public ChildAggregation (String childName, int childMarks, ParentAggregation ref)
	{
		
		this. childName = childName;
		this. childMarks = childMarks;
		this.ref = ref;
	}
	
	public void displayChild()
	{
		System.out.println(childName);
		System.out.println(childMarks);
		System.out.println(ref.name);
		System.out.println(ref.marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAggregation obj1 = new ParentAggregation ("Arun", 45);
		ChildAggregation obj = new ChildAggregation("Parthiv", 34, obj1);
		obj.displayChild();
	}

}
