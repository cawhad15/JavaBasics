package test.art1;

public class SuperKeywordChild extends SuperKeywordParentClass {

	String name = "ChildData";

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild cd = new SuperKeywordChild();
		cd.getStringdata();
		

	}

}
