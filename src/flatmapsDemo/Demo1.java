package flatmapsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		List<List<Integer>> summeList = Arrays.asList(list1, list2, list3);
		System.out.println(summeList); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		List<Integer> flatListMultiple = summeList.stream().flatMap(l -> l.stream().map(n -> n * 5))
				.collect(Collectors.toList());
		System.out.println(flatListMultiple); // [5, 10, 15, 20, 25, 30, 35, 40, 45]

	}

}
