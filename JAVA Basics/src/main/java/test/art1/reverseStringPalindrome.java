package test.art1;

public class reverseStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to reverse the string/palindrome string(e.g. noon, madam)
		
		String s = "madam";
		
		//create empty string to put reverse string in it
		String t = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//concatinate reverse character in the empty string and put it in empty string
			t = t+s.charAt(i);
			
		}
		System.out.println(t);
	}//t=madam

}
