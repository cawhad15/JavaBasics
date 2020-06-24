package test.art1;

public class ParentClassFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I navigate to the home page");
		
		//Step 2: Create an object of the ChildMehod class
		
		ChildMethod m = new ChildMethod();
		
		//tip to work: remember Classobject.methodname
		System.out.println(m.ValidateHeader());

	}

}
