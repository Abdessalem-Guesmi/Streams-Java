package mapsDemo;

import java.util.ArrayList;
import java.util.List;

class Employ {
	String name;
	double salary;

	public Employ(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Demo3 {

	public static void main(String[] args) {
		List<Employ> employees = new ArrayList<Employ>();
		employees.add(new Employ("Abdou", 1500));
		employees.add(new Employ("Guesmi", 2500));
		employees.add(new Employ("Micheal", 3000));
		employees.add(new Employ("François", 3700));
		employees.stream().filter(e -> e.salary > 2000 && e.salary <= 3000).forEach(e -> System.out.println(e.name));
//Guesmi  Micheal
	}

}
