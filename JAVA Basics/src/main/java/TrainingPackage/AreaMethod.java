package TrainingPackage;

public class AreaMethod {
	
	private static double Area = 0;

	public static double area(double pi, int x) {
		Area = pi*x*x;
		return Area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		int r = 2;

		
		area(pi,r);
		System.out.println(Area);
		

	}

}
