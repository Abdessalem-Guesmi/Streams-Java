package mapsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 20, 30);
		List<Integer> listMultiple = new ArrayList<>();
		listMultiple = list1.stream().map(l -> l * 3).collect(Collectors.toList());
		System.out.println(listMultiple); //
	}

}
