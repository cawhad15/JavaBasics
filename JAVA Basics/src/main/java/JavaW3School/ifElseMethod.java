package JavaW3School;

public class ifElseMethod {
	
	static void checkAge(int age) {
		if(age<18) {
			System.out.println("Access denied - You are not old enough");
		}
		else {
			System.out.println("Access granted - You are  old enough");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(20);

	}

}
