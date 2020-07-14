package org.maven.groupid;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String t="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);

	}

}
