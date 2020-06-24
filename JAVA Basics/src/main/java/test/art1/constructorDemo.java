package test.art1;

public class constructorDemo {
	
	public constructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	//parameterized constructor
	public constructorDemo(int a, int b) {
		System.out.println("This is parametrized constructor");
		
	}
	public void getdata() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor is a block of code whenever an object is created
		//whenever we create an object default/implicit constructor is called.
		constructorDemo cd = new constructorDemo();
		
		//object for parametrized constructor
		constructorDemo pc = new constructorDemo(4,5);

	}

}
