package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//non-terminal processing methods: distinct      limit

//terminal processing method: count
public class Demo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tunisia", "Germany", "Alger", "Pelastine", "Tunisia");
		System.out.println(list); // [Tunisia, Germany, Alger, Pelastine, Tunisia]
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		// Tunisia Germany Alger
		// Pelastine

		// numbre of elements into collection before distinct
		long count = list.stream().count();

		System.out.println(count); // 5

		// numbre of elements into collection after distinct

		long countdistinct = list.stream().distinct().count();
		System.out.println(countdistinct); // 4

		List<String> listLimit = list.stream().limit(3).collect(Collectors.toList());
		System.out.println(listLimit); // [Tunisia, Germany, Alger]

	}

}
