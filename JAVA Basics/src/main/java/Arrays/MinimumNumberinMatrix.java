package Arrays;

public class MinimumNumberinMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 4 5
		   3 4 7
		   5 2 1
		 */
		
		// 2nd method to define multidimentional1 array
		int a[][]= {{2,4,5},{3,4,7},{5,2,1}};
		int min = a[0][0];
		
		
		//finding minium number is the array
		for (int i=0;i<3;i++) { //row
			for (int j=0;j<3;j++) { //column
				
				if(a[i][j]<min)
				{
				System.out.println("minimum number is=>");
				System.out.println(a[i][j]);
				//System.out.println("\t");
				}
			}
			//System.out.println("\n");
		}
		
		
		//finding maximum number in the array
		int max = 7;
		for (int i=0;i<3;i++) { //row
			for (int j=0;j<3;j++) { //column
				
				if(a[i][j]>= max)
				{
				System.out.println("maximum number is=>");
				System.out.println(a[i][j]);
				//System.out.println("\t");
				}
			}
			//System.out.println("\n");
		}
		

	}

}
