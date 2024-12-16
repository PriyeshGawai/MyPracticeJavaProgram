package enum_;

public enum DaysList {

	Sunday, Monday,tuesday, Wednesday, thursday, Friday ,Saturday;
	
	public void display() {
		System.out.println("Today is>"+this.name());
	}
}
