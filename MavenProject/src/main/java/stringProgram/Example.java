package stringProgram;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hello";
		//length- to get the length or size of the string
		int len = st.length();
		System.out.println(len);
		
		
		String s = new String("HelloWorld");
		//charAt - to take specific character from string
		char val = s.charAt(4);
		System.out.println(val);
		
		char x[] = {'a','b','c'};
		String z = new String(x);
		System.out.println(x);
		
		String j = "java";
		String j1 = "Java";
		String j2 = "Selenium";
		//equals- to find two string is equal
		//equalsIgnoreCase- to ignore case and find if the string is equal
		
		
	
		System.out.println(j.equals(j1));
		System.out.println(j1.equals(j2));
		System.out.println(j.equalsIgnoreCase(j1));
		
		//uppercase
		System.out.println(j.toUpperCase());
		
		//Concat - to combine two strings
		
		System.out.println(j1.concat(j2));
		
		String var = "My name is Anagha";
		//contains method- to check specific word in string
		System.out.println(var.contains("name"));
		System.out.println(j1.contains(j2));
		
	    String var1 = "LOWERCASE";
	    //lowercase
	    System.out.println(var1.toLowerCase());
	    
	    //value of - for typecasting(convert any datatype to string)
	    
	    int var2 = 10;
	    String var3 = String.valueOf(var2);
	    System.out.println(var3);
	    
	    //is empty - to find if string is empty or not(space will also be considered as a character)
	    String var4 = "";
	    System.out.println(var4.isEmpty());
	    
	    String val1 = "hello";
	    String val2 = "hello";
	    System.out.println(val1==val2);
	    
	    String val3 = new String("hello");
	    System.out.println(val2==val3);//.equals method checks the value while equal equal checks the memory
	}

}
