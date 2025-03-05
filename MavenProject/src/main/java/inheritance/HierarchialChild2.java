package inheritance;

public class HierarchialChild2 extends HierarchialParent{
	public void display2()
	{
		System.out.println("This is child 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild2 obj = new HierarchialChild2();
		obj.display2();
		obj.print();

	}

}
