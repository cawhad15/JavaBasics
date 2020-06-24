package TrainingPackage;

public class DemoClass {
	
	int a;
	int b;
	
	public void SetA(int x) {
		a=x;
		
	}
	public void SetB(int y) {
		b=y;
	}
	public int GetA() {
		return a;
	}
	public int GetB() {
		return b;
	}
	
	public void display() {
		System.out.println("I am in display");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
