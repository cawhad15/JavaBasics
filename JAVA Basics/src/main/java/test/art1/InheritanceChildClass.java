package test.art1;

public class InheritanceChildClass extends InheritanceParentClass{
	public static void main(String[] args) {
		
		InheritanceChildClass c = new InheritanceChildClass();
		
		//below will take text present from the parent class
	    c.city();
	    c.country();
	}

}
