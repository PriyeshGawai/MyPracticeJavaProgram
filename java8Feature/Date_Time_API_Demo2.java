package java8Feature;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class Date_Time_API_Demo2 {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		date=date.plusDays(5);
		System.out.println(date);
		
		date=date.plusMonths(5);
		System.out.println(date);
		
		date=date.plusYears(2);
		System.out.println(date);
		
		boolean leapYear=LocalDate.parse("2024-12-05").isLeapYear();
		System.out.println("Leap Year:::"+ leapYear);
		
		boolean before=LocalDate.parse("2020-02-05").isBefore(LocalDate.parse("2025-02-23"));
		System.out.println("Before:: "+before);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		localTime=localTime.plusHours(5);
		System.out.println(localTime);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		Period diff=Period.between(LocalDate.parse("2000-02-25"), LocalDate.now());// period use to take date
		System.out.println(diff);
		
		Duration duration=Duration.between(localTime.parse("14:00"), localTime.now());
		System.out.println(duration);
	}

}
