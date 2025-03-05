package inheritance;

public class MultiChild extends MultiIntermid {
	
	public void product()
	{
		int a =2;
		int b =3;
		int c =a*b;
		System.out.println("Product is "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj1 = new MultiChild();
		obj1.sum();
		obj1.difference();
		obj1.product();
	}

}
