package inheritance;

public class SingelParentwithMainMethod extends SingleParent{
	
	public void result()
	{
		System.out.println("This is a child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingelParentwithMainMethod obj = new SingelParentwithMainMethod();
		obj.result();
		obj.display();
		SingleParent obj1 = new SingleParent();
		obj1.display();
		
	}

}
