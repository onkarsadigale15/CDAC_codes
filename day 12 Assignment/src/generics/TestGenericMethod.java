package generics;

import java.util.Arrays;
import java.util.Vector;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.HashSet;

//3.3 Write a generic method to accept ANY type of the collection
//(any list or any set) of numbers (ints/double/float) 
//& return it's sum
public class TestGenericMethod {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(Arrays.asList(10, 20, 30, 40));
		System.out.println("sum= " + add(v1));

		HashSet<Double> hs = new HashSet<>(Arrays.asList(10.0, 20.77, 30.89, 40.89));
		System.out.println("sum= " + add(hs));

		// Integer IS A Number : true
		// Collection<Integer> IS A Collection<Number<> : false

		System.out.println("sum= " + add2(v1));
		System.out.println("sum= " + add2(hs));

	}

//	public static double  add(Collection<Integer> coll)
//	{
//	double sum =0;
//	for(int i : coll)
//		sum +=i;
//	return sum;
//	}
	public static double add(Collection<? extends Number> coll) {
		Iterator<? extends Number> itr = coll.iterator();
		double sum = 0;
		while (itr.hasNext())
			sum += itr.next().doubleValue();
		return sum;
	}

	public static <T extends Number> double add2(Collection<T> coll) {
		Iterator<? extends Number> itr = coll.iterator();
		double sum = 0;
		for (T t : coll)
			sum += t.doubleValue();
		return sum;
	}
}
