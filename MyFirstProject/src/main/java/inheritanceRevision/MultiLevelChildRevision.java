package inheritanceRevision;

public class MultiLevelChildRevision extends MultiLevelInterRevision {
	
	public void number ()
	{
		int a = 5;
		int b = 9;
		int c = a*b;
		System.out.println(c);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChildRevision ssd = new MultiLevelChildRevision();
		ssd.display();
		ssd.place(5, 7, 10);
		ssd.number();
	}

}
