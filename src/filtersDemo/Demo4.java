package filtersDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employ {
	String name;
	double salary;

	public Employ(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Demo4 {

	public static void main(String[] args) {
		List<Employ> employees = Arrays.asList(new Employ("Abdou", 1500), new Employ("Guesmi", 2500),
				new Employ("Micheal", 3000), new Employ("François", 3700));
		List<Double> empl = employees.stream().filter(e -> e.salary > 2000 && e.salary <= 3000).map(e -> e.salary)
				.collect(Collectors.toList());

		System.out.println(empl);
		// Guesmi Micheal
	}

}
