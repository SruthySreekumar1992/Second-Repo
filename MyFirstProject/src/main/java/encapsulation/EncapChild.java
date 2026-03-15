package encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapParent obj = new EncapParent ();
		obj.setName("Sruthy");
		obj.setAge(30);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
