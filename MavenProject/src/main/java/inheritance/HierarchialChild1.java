package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	
	public void display1()
	{
		System.out.println("This is child 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild1 obj = new HierarchialChild1();
		obj.print();
		obj.display1();

	}

}
