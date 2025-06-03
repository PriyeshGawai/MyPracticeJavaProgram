package streamApi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class readFileData {

	public static void main(String[] args) throws Exception {
//		FileReader fr=new FileReader(new File("F:\\Eclips Wokplace2\\Practice\\src\\streamApi\\demo.txt")); //read data character by character
//		
//		BufferedReader br=new BufferedReader(fr); // get data line by line
//		
//		String line = br.readLine();
//		
//		while(line!=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br.close();
		
		String file="F:\\Eclips Wokplace2\\Practice\\src\\streamApi\\demo.txt";
		
		List<String> lines=new ArrayList<String>();
		
		try(Stream<String> stream= Files.lines(Paths.get(file))) {
			
			//stream.forEach(System.out::println);
			
			stream.filter(a -> a.startsWith("H")).forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
