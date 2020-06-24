package LeetCode;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * num1 = [1,2,3,0,0,0] num2=[2,5,6] m=3, n=3
		 * 
		 * Output: [1,2,2,3,5,6]
		 */

		int num1[] = { 1, 2, 3, 0, 0, 0 };
		int num2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		int num3[] = new int[m + n];
		int k = 0;
		int i = 0, j = 0;
		

		while (i<num1.length && j<num2.length) {
			if (num1[i] < num2[j]) {
				num3[k] = num1[i];
				i++;
				k++;
			} 
			else {
				num3[k] = num2[j];
				k++;
				j++;
			}
		}

		while (i < m)
			num3[k] = num1[i];
		i++;
		k++;

		while (i < n)
			num3[k] = num2[j];
		j++;
		k++;

		for (int t = 0; t < m+n; t++) {
			System.out.println(num3[t] + " ");
		}

	}

}
