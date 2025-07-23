package java8Feature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time_Demo {

	public static void main(String[] args) throws Exception {
		Date date=new Date();
		System.out.println(date);
		
		//Converting Date to time
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
		String format=sd.format(date);
		System.out.println(format);
		
		SimpleDateFormat sd2=new SimpleDateFormat("MMMM/dd/YYYY");
		String format2=sd2.format(date);
		System.out.println(format2);
		
		//converting String to date
		SimpleDateFormat sd3 =new SimpleDateFormat("dd/MM/yy");
		Date da =sd3.parse("05/05/25");
		System.out.println(da);
		
		
	}

}
