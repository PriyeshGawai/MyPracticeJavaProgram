package java8Feature;

import java.time.LocalDate;
import java.util.Date;

public class Date_Time_API_Demo2 {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		date=date.plusDays(5);
		System.out.println(date);
		
		date=date.plusMonths(5);
		System.out.println(date);
	}

}
