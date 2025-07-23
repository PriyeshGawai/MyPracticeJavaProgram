package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxAvgSalOfEmp {

	public static void main(String[] args) {
		EmpDetail ed1=new EmpDetail("Abhay", 25000);
		EmpDetail ed2=new EmpDetail("Anita", 35000);
		EmpDetail ed3=new EmpDetail("visha", 15000);
		EmpDetail ed4=new EmpDetail("mani", 2000);
		EmpDetail ed5=new EmpDetail("ching", 5000);
		EmpDetail ed6=new EmpDetail("akash", 9000);
		
		
		//Stream<EmpDetail> emp=Stream.of(ed1, ed2, ed3, ed4, ed5, ed6);
		/*
		 * we cann't do operation on one stream after one so we will create list
		 */
		
		List<EmpDetail> list=Arrays.asList(ed1, ed2, ed3, ed4, ed5, ed6);
		Optional<EmpDetail> maxSal=list.stream().collect(Collectors.maxBy(Comparator.comparing(a->a.sal)));
		
		if(maxSal.isPresent()) {
			System.out.println(maxSal.get().sal);
		}
		
		Optional<EmpDetail> minSal=list.stream().collect(Collectors.minBy(Comparator.comparing(a ->a.sal)));
		
		if(minSal.isPresent())
		System.out.println(minSal.get().sal);
		
		double avgSal=list.stream().collect(Collectors.averagingDouble(a->a.sal));
		System.out.println(avgSal);
		
		
	}

}

class EmpDetail{
	String name;
	float sal;
	
	public EmpDetail(String name, float sal) {
		
		this.name=name;
		this.sal=sal;
	}
}