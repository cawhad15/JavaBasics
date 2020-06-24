package Arrays;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,3,5,1,9};
		
		int m=2;
		int max = 9;
		
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]<m)
			 {
				 System.out.println("Minimum Number is:"+a[i]);
				 //System.out.println(a[i]);
			 }
			 if(a[i]>=max)
			 {
				 System.out.println("Maximum Number is:"+a[i]);
				// System.out.println(a[i]);
			 }
			 
		}
		
		

	}

}
