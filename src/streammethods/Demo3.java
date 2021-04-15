package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce
public class Demo3 {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("A", "1", "B", "2", "D", "3");

		Optional<String> reduceList = stringList.stream().reduce((value, combinevalue) -> {
			return combinevalue + value;
		});
		System.out.println(reduceList.get()); // 3D2B1A
	}

}
