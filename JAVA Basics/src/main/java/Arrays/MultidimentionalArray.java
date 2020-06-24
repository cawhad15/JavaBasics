package Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1st method to define multidimentional array
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;

		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;*/
		
		/* 2 4 5
		   3 4 7
		   5 2 1
		 */

		// 2nd method to define multidimentional1 array
		int a[][]= {{2,4,5},{3,4,7},{5,2,1}};

		// to print one digit from array, give that array location
		// System.out.println(a[1][0]);

		// To print all values of array in matrix form
		for (int i=0;i<3;i++) { //row
			for (int j=0;j<3;j++) { //column
				
				System.out.println(a[i][j]);
				System.out.println("\t");
			}
			System.out.println("\n");
		}

	}

}
