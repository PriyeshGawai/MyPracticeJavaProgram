package enum_;

public class Day {
	
	public static void main(String[] args) {
	
		DaysList d=DaysList.Monday;
		
		int ordinal=d.ordinal();// return index no of day
		System.out.println(ordinal);
		
		System.out.println(d.name());
		
		DaysList[] d2=d.values();// return all value of enum
		for(DaysList i:d2) {
			System.out.println(i);
		}
		
		/*
		 * valueOf return string if present else throw 
		 * java.lang.IllegalArgumentException: No enum constant enum_.DaysList.tuesrday
		 */
		
		DaysList day=d.valueOf("tuesday");
		System.out.println(day);
		
		/*
		 * we can create method in enum
		 */
		d.display();
		
		System.out.println("=== Daylist 2===");
		DaysList2 sat=DaysList2.Saturday;
		System.out.println(sat.getUpper());;
	}
}
