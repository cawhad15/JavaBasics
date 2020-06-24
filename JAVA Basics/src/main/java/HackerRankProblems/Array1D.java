package HackerRankProblems;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*input {5,10,20,30,40}, output: {10,20,30,40,50}*/
		
		int a[]= {5,10,20,30,40,50};
		
		/*System.out.println("Input is:");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}*/
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int j=0;j<n;j++)
		{
			System.out.println("output is:");
			a[j] = scan.nextInt();
			System.out.println(a[j]);
			
		}
		scan.close();
	}

}
