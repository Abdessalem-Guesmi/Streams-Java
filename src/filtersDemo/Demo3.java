package filtersDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("Tunisia", "France", "Polland", "Alger", "Egypt", "Hind");
		List<String> shortCountry = new ArrayList<String>();
		// within using streams

		for (String c : countries) {
			if (c.length() == 4)
				shortCountry.add(c);
		}
		System.out.println(shortCountry); // [Hind]

		shortCountry = countries.stream().filter(c -> c.length() > 5 && c.length() < 8).collect(Collectors.toList());
		System.out.println(shortCountry); // [Tunisia, France, Polland]
		countries.stream().filter(c -> c.length() > 5 && c.length() < 8).forEach(c -> System.out.println(c));
		countries.stream().filter(c -> c.length() > 5 && c.length() < 8).forEach(System.out::println);

	}
}
