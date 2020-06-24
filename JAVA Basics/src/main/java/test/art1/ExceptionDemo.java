package test.art1;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7;
		int c = 0;
		try
		{
			  //try block is trying something that can throw an error
			int k = b/c;
			System.out.println(k);
		}
		catch(Exception e)
		{
			//since try block will throw an error that will be catched by catch and will show following msg
			System.out.println("I catched the error/exception");
		}
		finally
		{
			// try block has wronf code that catched by catch block. eventhough there is an error in code still it executed finally block.
			System.out.println("driver.close in finally block");
		}

	}

}
