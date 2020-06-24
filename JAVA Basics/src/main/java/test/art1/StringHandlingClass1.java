package test.art1;

public class StringHandlingClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// type 1:
		String str1 = "Payment $100 paid";
		// to know where the 1 is present or any letter is present. it is present in 9th
		// index
		System.out.println(str1.charAt(8));
		// To know where the $ is present
		System.out.println(str1.indexOf("$"));

		// to write the subtring we need to know the starting character with this methos
		System.out.println(str1.substring(8));

		// type2
		String str2 = new String("Payment $200 paid");

	}

}
