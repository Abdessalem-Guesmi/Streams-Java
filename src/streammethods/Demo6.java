package streammethods;

import java.util.HashSet;
import java.util.Set;

//anyMatch
//allMatch
//noneMatch
public class Demo6 {

	public static void main(String[] args) {

		Set<String> list1 = new HashSet<>();
		list1.add("one banane");
		list1.add("two Kiwi");
		list1.add("three banane");
		list1.add("oneFraise");
		boolean anymatch = list1.stream().anyMatch(s -> s.startsWith("one"));
		System.out.println(anymatch); // true

		boolean allmatch = list1.stream().allMatch(s -> s.startsWith("one"));
		System.out.println(allmatch); // false
		boolean nonematch = list1.stream().noneMatch(s -> s.startsWith("one"));
		System.out.println(nonematch); // false

	}

}
