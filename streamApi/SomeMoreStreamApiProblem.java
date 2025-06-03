package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomeMoreStreamApiProblem {

	public static void main(String[] args) {

		List<Employee> emp=new ArrayList<Employee>();
		
		emp.add(new Employee(10, "Ganesh",30, "Male", "Sale", 2020, 70000));
		emp.add(new Employee(20, "Gayatri", 40,"Female", "HR", 2012, 40000));
		emp.add(new Employee(30, "Ashok", 45, "Male", "Development", 2015, 90000));
		emp.add(new Employee(40, "Gita", 25, "Female","Security", 1999, 100000));
		emp.add(new Employee(50, "Amruta",22, "Female", "Testing", 2023, 10000));
		emp.add(new Employee(60, "Siddhant", 28,"Male", "Infrastructure", 2020, 50000));
		emp.add(new Employee(70, "Rohit", 31,"Male", "Sale", 2020, 70000));
		emp.add(new Employee(80, "Om",20, "Male", "HR", 2020, 80000));
		emp.add(new Employee(90, "Sudarshan",22, "Male", "Testing", 1998, 20000));
		emp.add(new Employee(100, "Nayan", 25,"Female", "Sale", 2020, 55000));
		emp.add(new Employee(101, "kajal", 45, "Female", "Development", 2020, 42000));
		emp.add(new Employee(102, "Sakshi",36, "Female", "Testing", 2015, 33000));
		emp.add(new Employee(103, "Vaishanvi",55, "Female", "Sale", 2012, 22000));
		emp.add(new Employee(104, "Naina",60, "Female", "Security", 2018, 25000));
		emp.add(new Employee(105, "Sham",33, "Male", "Development", 2025, 15000));
		emp.add(new Employee(106, "Shamal", 48,"Female", "Sale", 2004, 45000));
		emp.add(new Employee(107, "abhi",19, "Male", "Security", 2005, 60000));
		
		
		System.out.println("How many male and Female employee in the organization??");
		Map<String, Long> countEmp=emp.stream().collect(Collectors.groupingBy(a -> a.gender, Collectors.counting()));
		System.out.println(countEmp);
		
		System.out.println("Print the name of all department in the organization??");
//		emp.stream().forEach(a-> System.out.println(a.department));
		
		emp.stream().map(a->a.department)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Avg Age of male and female");
		Map<String, Double> avgAge =emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getage)));
		System.out.println(avgAge);

		System.out.println("Get information of highest paid employee in the organization..");
//		Optional<Employee> e=emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.salary)));
		Optional<Employee> e=emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if(e.isPresent()) {
			Employee e1=e.get();
			System.out.println(e1);
		}
		
		System.out.println("Give name of Emp who joined after 2015");
//		emp.stream().filter(a -> a.yearOfJoining>2015)
//					.forEach(a->System.out.println(a.getName()));
		
		emp.stream().filter(a -> a.yearOfJoining>2015)
		.map(a->a.name+" :: "+a.yearOfJoining)
		.forEach(a->System.out.println(a));
		
		
		System.out.println("Count Number of employee in each department");
		Map<String,Long> empDep= emp.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
		System.out.println(empDep);	
		
		System.out.println("How to find Avg Salary of each department?");
		Map<String,Double> empDepAvgSal = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(empDepAvgSal);
		
		System.out.println("Find yougest Female employee in sale Department");
		Optional<Employee> empDetails= emp.stream().filter(a -> a.getDepartment().equals("Sale") && a.getGender().startsWith("F"))
										.min(Comparator.comparing(Employee::getage));
		
		System.out.println(empDetails.get());
		
		System.out.println("Who has most working experience in the organization?");
//		Optional<Employee> mostWork = emp.stream().min(Comparator.comparing(Employee::getYearOfJoining));
		Optional<Employee> mostWork = emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(mostWork.get());
		
		System.out.println("How many male &  Female emp in  sale department");
		Map<String, Long> countMFEmp = emp.stream().filter(a -> a.department.equals("Sale"))
					.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(countMFEmp);
		
		System.out.println("What is avg Salary of male and Female Emp");
		
		Map<String, Double> avgSAlByMF = emp.stream().collect(Collectors
						.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSAlByMF);
		
		System.out.println("List down name of all Employee in each department?");
		Map<String, List<String> > list = emp.stream().collect(Collectors
							.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(list);
		
		System.out.println("What is the avg and total Salary of whole organization");
		double avgSal  = emp.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		double avgSal2  = emp.stream().collect(Collectors.summingDouble(Employee::getSalary));
		
		
		System.out.println("avgSal::"+avgSal+" :: "+avgSal2);
		
		
		System.out.println("Separate the employee who are younger or equal to 25 year from those employee who are older than 25 years?");
		
		
		
		System.out.println("Employee who have 2nd highest salary ?");
//		Stream<Employee> sort= emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1);
//		sort.forEach(System.out::println);
		
//		Optional<Employee> sort= emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//		System.out.println(sort.get());
		
		List<Employee> sort= emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
//		sort.forEach(System.out::println);
		System.out.println(sort.get(1));
	}
	
}

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	
	public Employee(int id, String name,int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}


	public void setage(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getYearOfJoining() {
		return yearOfJoining;
	}


	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
}