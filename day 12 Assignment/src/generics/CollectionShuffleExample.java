package generics;

import java.util.Arrays;
// Collections.shuffle() to shuffle list elements
import java.util.Collections;
import java.util.List;

public class CollectionShuffleExample {

	public static void main(String[] args) {
		// 1)

		List<String> list1 = Arrays.asList("ADITYA", "BHIM", "AKSHAY", "LOKESH");
		// Collections API : public static void shuffle(List<?> list) : unbounded wild
		// card
		Collections.shuffle(list1);
		System.out.println(list1);

		// 2)

		List<Double> doubles = Arrays.asList(1.0, 2.67, 3.9, 4.1, 5.6, 6.90);// autoboxing (int ...>Integer....X Double)
		Collections.shuffle(doubles);
		System.out.println(doubles);
	}

	//
}
