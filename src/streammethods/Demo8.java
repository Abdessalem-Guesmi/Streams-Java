package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//concatination 2 streams
public class Demo8 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");
		Stream<String> stream1 = list1.stream();
		Stream<String> stream2 = list2.stream();
		List<String> streamconc = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(streamconc); // [A, B, C, D, E, F]
		for (String s : streamconc) {
			System.out.println(s);
		}
	}

}
