package flatmapsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<String> names1 = Arrays.asList("name1", "name2", "name3");
		List<String> names2 = Arrays.asList("name4", "name5", "name6");
		List<String> names3 = Arrays.asList("name9", "name8", "name7");
		List<List<String>> summeNames = Arrays.asList(names1, names2, names3);
		System.out.println(summeNames); // [[name1, name2, name3], [name4, name5, name6], [name9, name8, name7]]
		List<String> flatNames = summeNames.stream().flatMap(l -> l.stream().map(s -> s.toUpperCase()))
				.collect(Collectors.toList());
		System.out.println(flatNames); // [NAME1, NAME2, NAME3, NAME4, NAME5, NAME6, NAME9, NAME8, NAME7]

	}
}
