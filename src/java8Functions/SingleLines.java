package java8Functions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SingleLines {
	// muliples of 5 till 5values
	/*
	 * for(int i=5;i%5==0;i++) {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// multiples of 5,2
		Stream.iterate(1, n -> n + 1).filter(n -> n % 5 == 0).limit(5).forEach(System.out::println);
		Stream.iterate(2, n -> n + 1).filter(n -> n % 2 == 0).limit(10).forEach(System.out::println);
		//IntStream.range(2, 15).noneMatch(index -> 15 % index == 0);
		// below line of code works for a specific value to check if its prime or not
		// yet to find a better solution
		System.out.println(IntStream.range(2, 17).noneMatch(index -> 17 % index == 0));
		int i= 21;
		System.out.println(IntStream.range(2, i).noneMatch(index -> i % index == 0));
		System.out.println(IntStream.range(2, 25).noneMatch(index -> i % index == 0));
		// IntStream.iterate(2, n-> n+1).limit(50).forEach(i -> n % n+i ==
		// ).forEach(System.out::println);
		intstreamExamples();
			}

	public static boolean isPrime(int i) {
		IntPredicate isDivisible = index -> i % index == 0;
		return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
	}

	public static void intstreamExamples() {

		int[] intArray = IntStream.of(1, 2, 3, 1, 2, 3).toArray();
		System.out.println("int array : " + Arrays.toString(intArray));

		List<Integer> list = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toList());
		System.out.println("IntStream to List : " + list);

		Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());
		System.out.println("IntStream to Set : " + set);

		//Stream.iterate(0, n -> n + 1).limit(20).filter(somevar::isPrime);

	}
}
