package java8Feature;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass_MsgService {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=sc.nextInt();
		
//		String name=new OptionalClass_User().getUser(id);
//		if(name!=null)
//		System.out.println(name.toUpperCase()+" "+"Hello");
//		else
//			System.out.println("Invalid Id");
		
	Optional<String> o=new OptionalClass_User().getUser2(id);
	
	if(o.isPresent())
		System.out.println(o.get().toUpperCase()+" "+"Hello");
		else
			System.out.println("Id Not Found");
	}

}
