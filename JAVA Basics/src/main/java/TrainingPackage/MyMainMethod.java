package TrainingPackage;

public class MyMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass obj = new DemoClass();
		System.out.println("I am in main");
		
		obj.SetA(10);
		obj.SetB(20);
		
		int x = obj.GetA();
		System.out.println(x);
		
         
		int y = obj.GetB();
		System.out.println(y);
		
		System.out.println("I am back in main");
	}

}
