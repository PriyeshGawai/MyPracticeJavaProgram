package java8Feature;

import java.util.Optional;

public class OptionalClass_User {
	public static String getUser(Integer id) {
		if(id==100) {
			return "Priyesh";
		}else if (id==200) {
			return "Aman";
		}else if (id==300) {
			return "sumit";
		}else {
			return null;
		}
	}
	
	
	public static Optional<String> getUser2(Integer id) {
		String name=null;
		if(id==100) {
			name="Priyesh" ;
		}else if (id==200) {
			name="kamal" ;
		}else if (id==300) {
			name="sumit" ;
		}
		return Optional.ofNullable(name);
	}
}
