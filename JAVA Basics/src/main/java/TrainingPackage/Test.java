package TrainingPackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gender ="Female";
		int mAge = 22;
		int fAge = 32;
		
		if((gender=="male"&&mAge>=21) || (gender=="Female"&&fAge>=18))
		{
			System.out.println("both are eligible for voting");
		}

	
		else
		{
			System.out.println("Both are not eligible for voting");
		}

	}

}
