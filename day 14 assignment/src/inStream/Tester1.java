package inStream;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream=IntStream.of(1,2,3,4,5,6,7,8);
//		Iterator<Integer> itr=stream.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		System.out.println("Using for each method");
		stream.forEach(value->System.out.println(value));
	}

}
