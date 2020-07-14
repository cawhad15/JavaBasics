package JavaW3School;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While Loop
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		System.out.println("\n");
		
		//For statement
		for(int i1=0;i1<=10;i1=i1+2)
		{
			System.out.println(i1);
		}
		
		System.out.println("\n");
		
		//Use of Break in a loop
		
		for(int i2=0;i2<10;i2++) {
			if(i2==4) {
				break;
			}
			
			System.out.println(i2);
		}
	}

}
