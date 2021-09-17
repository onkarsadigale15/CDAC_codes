package inStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester2 {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,9,8,4,5);	
	Stream<Integer> stream=	list.parallelStream();
	stream.forEach(temp->System.out.println(temp));
}
}
