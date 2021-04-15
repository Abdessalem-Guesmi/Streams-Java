package parallelStreamDemo;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Demo1 {

	public static void main(String[] args) {
		List<Employ> employs = Arrays.asList(new Employ("name1", 1500), new Employ("name2", 2500),
				new Employ("name3", 3500), new Employ("name4", 4500), new Employ("name5", 5500));
		// stream sequencial
		List<String> empl = employs.stream().filter(e -> e.salary > 2500)
				.map(e -> e.getName() + " with salary :" + e.getSalary()).limit(2).collect(Collectors.toList());
		System.out.println(empl); // [name3 with salary :3500.0, name4 with salary :4500.0]
		for (String s : empl) {
			System.out.println(s);
		}

		// stream parallel
		List<String> emplparallel = employs.stream().parallel().filter(e -> e.salary > 2500)
				.map(e -> e.getName() + " with salary :" + e.getSalary()).limit(2).collect(Collectors.toList());
		System.out.println(emplparallel); // [name3 with salary :3500.0, name4 with salary :4500.0]
		for (String s : emplparallel) {
			System.out.println(s);
		}
	}

}
