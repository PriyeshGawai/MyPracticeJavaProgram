package enum_;

public enum DaysList2 {

	Sunday("SUNDAY"), 
	Monday("MONDAY"),
	tuesday("TUESDAY"),
	Wednesday("WEDNESDAY"), 
	thursday("THURSDAY"), 
	Friday("FRIDAY") ,
	Saturday("SATURDAY");
	
	private String upper;
	
	public String getUpper() {
		return upper;
	}
	private DaysList2(String upper) {
		System.out.println("constructor is called!");
		this.upper = upper;
	}
	public void display() {
		System.out.println("Today is>"+this.name());
	}
}
