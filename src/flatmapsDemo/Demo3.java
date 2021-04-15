package flatmapsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employ {
	int id;
	String name;
	double salary;

	public Employ(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class Demo3 {

	public static void main(String[] args) {
		List<Employ> employ1 = Arrays.asList(new Employ(1, "Abdou", 1500), new Employ(2, "Moetez", 2500),
				new Employ(3, "Guesmi", 3000));
		List<Employ> employ2 = Arrays.asList(new Employ(4, "Jack", 1700), new Employ(5, "Jean", 2700),
				new Employ(6, "Paul", 3200));
		List<Employ> employ3 = Arrays.asList(new Employ(7, "Fethi", 1900), new Employ(8, "Faycel", 2900),
				new Employ(9, "Neji", 3400));

		List<List<Employ>> allEmploys = Arrays.asList(employ1, employ2, employ3);
		List<String> flatEmploys = allEmploys.stream()
				.flatMap(e -> e.stream().filter(r -> r.salary > 1700 && r.salary < 3500).map(r -> r.id + ": " + r.name))
				.collect(Collectors.toList());
		System.out.println(flatEmploys); // [2: Moetez, 3: Guesmi, 5: Jean, 6: Paul, 7: Fethi, 8: Faycel, 9: Neji]

	}

}
