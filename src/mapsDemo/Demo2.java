package mapsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("Tunisia", "France", "Polland", "Alger", "Egypt", "Hind");
		List<String> Country = new ArrayList<String>();
		Country = countries.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
		System.out.println(Country); // [TUNISIA, FRANCE, POLLAND, ALGER, EGYPT, HIND]

	}

}
