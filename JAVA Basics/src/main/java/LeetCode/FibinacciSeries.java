package LeetCode;

public class FibinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,1,2,3,5,8};
		int n;
		
		for(int i=0;i<=a.length;i++)
		{
			a[i]=a[i]+a[i+1];
			System.out.println(a[i]);
			//break;
		}
	
		
		

	}

}
