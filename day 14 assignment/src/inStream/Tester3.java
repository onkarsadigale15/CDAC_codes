package inStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream stream=IntStream.range(1,100);
		
		//stream.filter(temp->temp%2==0).forEach(System.out::println);;
		List<String> list=Arrays.asList("Ramesh","Suresh","Ganesh");
		list.stream().filter(temp->temp.startsWith("R")).forEach(System.out::println);
	
	}

}
