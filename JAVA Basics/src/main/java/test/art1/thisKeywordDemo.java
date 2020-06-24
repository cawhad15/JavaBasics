package test.art1;

public class thisKeywordDemo {
	int a= 2;
	
	public void getData() {
		int b = 3;
		int c = b+this.a;
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordDemo td = new thisKeywordDemo();
		td.getData();

	}

}
