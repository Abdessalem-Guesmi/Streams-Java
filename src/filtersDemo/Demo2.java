package filtersDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 15, 15, 20, 25, 30, 35, 35, 36, 40, 45);

		List<Integer> distinctNumber = new ArrayList<>();
//using streams
		distinctNumber = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumber); // [10, 15, 20, 25, 30, 35, 36, 40, 45]
	}

}
