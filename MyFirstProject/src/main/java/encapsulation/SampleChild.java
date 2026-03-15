package encapsulation;

public class SampleChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleParent obj = new SampleParent ();
		obj.setName("Parthiv");
		obj.setMarks(25);
		System.out.println(obj.getName());
		System.out.println(obj.getMarks());
	}

}
