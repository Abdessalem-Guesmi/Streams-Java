package streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sort
public class Demo4 {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("A", "R", "B", "F", "D", "X");
		List<String> sortingList = stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortingList); // [A, B, D, F, R, X]
		List<String> reverseList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseList); // [X, R, F, D, B, A]

	}

}
