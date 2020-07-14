package JavaW3School;

public class javaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "John";
		System.out.println("Hello " + name);
		
		//------
		String firstName = "Charu";
		String lastName = "Awhad";
		
		String fullName = firstName + lastName;
		System.out.println(fullName);

		
		//----
		int x=5, y= 6, z = 7;
		System.out.println(x +y +z);
		
		
		//--- String length
		
		String txt = "Charu";
		System.out.println("The length of txt string is:" +txt.length());
		
		//-- toUpperCase() and toLowerCase() string methods
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
	}

}
