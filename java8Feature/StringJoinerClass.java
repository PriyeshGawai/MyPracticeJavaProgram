package java8Feature;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("_");
		
		sj.add("Priyesh");
		sj.add("Learning");
		sj.add("Java 8");
		sj.add("feature");
		
		System.out.println(sj); //Priyesh_Learning_Java 8_feature
		
		StringJoiner sj2=new StringJoiner("_", "(",")"); //(Priyesh_Learning_Java 8_feature)
		sj2.add("Priyesh");
		sj2.add("Learning");
		sj2.add("Java 8");
		sj2.add("feature");
		
		System.out.println(sj2);
	}

}
