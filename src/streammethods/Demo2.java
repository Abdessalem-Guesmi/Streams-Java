package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<Integer> numbrs = Arrays.asList(2, 3, 5, 8, 9, 10, 12, 14);
		// count
		List<Integer> listevenNumbers = numbrs.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(listevenNumbers); // [2, 8, 10, 12, 14]
		long evenNumbers = numbrs.stream().filter(n -> n % 2 == 0).count();
		System.out.println(evenNumbers); // 5

		// min
		Optional<Integer> minimum = numbrs.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(minimum.get()); // 2
		Optional<Integer> maximum = numbrs.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(maximum.get()); // 14
	}

}
