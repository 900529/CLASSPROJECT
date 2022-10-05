package chapter11;

import java.util.HashSet;
import java.util.TreeSet;

public class SmartPhoneTreeSetTest {

	public static void main(String[] args) {

		TreeSet<SmartPhone> set = new TreeSet<>();

		set.add(new SmartPhone("java", "010-0000-2000"));
		set.add(new SmartPhone("Son", "010-3333-0000"));
		set.add(new SmartPhone("Spring", "010-0004-0000"));
		set.add(new SmartPhone("King", "010-0000-0000"));
		set.add(new SmartPhone("Scott", "010-1111-0000"));
		set.add(new SmartPhone("adam", "010-0330-0000"));

		System.out.println("요소의 개수 : " + set.size());

		for (SmartPhone sp : set) {
			System.out.println(sp);
	
		}
		

	}

}
