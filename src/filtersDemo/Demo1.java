package filtersDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 15, 20, 25, 30, 35, 36, 40, 45);
		// without using streams
		List<Integer> evenNumber = new ArrayList<>();

		for (int n : list1) {
			if (n % 2 == 0)
				evenNumber.add(n);
		}
		System.out.println(evenNumber); // [10, 20, 30, 36, 40]
//  using streams
		evenNumber = list1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber); // [10, 20, 30, 36, 40]

		list1.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		list1.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
