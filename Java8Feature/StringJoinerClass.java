package java8Feature;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("_");
		
		sj.add("Priyesh");
		sj.add("Learning");
		sj.add("Java 8");
		sj.add("feature");
		
		System.out.println(sj);
		
		StringJoiner sj2=new StringJoiner("_", "(",")");
		sj2.add("Priyesh");
		sj2.add("Learning");
		sj2.add("Java 8");
		sj2.add("feature");
		
		System.out.println(sj2);
	}

}
