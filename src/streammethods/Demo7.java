package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findany
//findfirst
public class Demo7 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three", "four");
		Optional<String> el = list.stream().findAny();
		System.out.println(el.get()); // one
		Optional<String> el2 = list.stream().findFirst();
		System.out.println(el2.get()); // one
	}

}
