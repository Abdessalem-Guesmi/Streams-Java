package streammethods;

import java.util.Arrays;
import java.util.List;

//to Array
public class Demo5 {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("A", "R", "B", "F", "D", "X");
		Object arr[] = stringList.stream().toArray();
		for (Object a : arr) {
			System.out.println(a); // A R B F D X
		}

	}

}
