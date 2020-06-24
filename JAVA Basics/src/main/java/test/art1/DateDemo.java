package test.art1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print default current date and time
		Date d = new Date();
		System.out.println(d.toString());
		
		//printing Date in mm/dd/yyyy HH:MM:SS format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		

	}

}
