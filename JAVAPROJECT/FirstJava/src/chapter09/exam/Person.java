package chapter09.exam;

public class Person {

	String name;
	String personNumber;

	// Person 클래스의 equals() 메소드를 오버라이딩해서
	// 생성자
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// 오버라이딩 : equals
	// 주민번호가 같으면 같은 인스턴스로 판별하는 프로그램 만들어보자! "000000-0000000"
	@Override
	public boolean equals(Object obj) {
		boolean result = false; // (1) 먼저 만들어주고

		// (3) 매개 변수로 전달받은 객체와 비교 : 주민번호
		if (obj != null && obj instanceof Person) {
			// Object는 null이 아니고, Object -> Person으로 형변환 가능
			Person person = (Person) obj;
			// 문자열 주민번호와 비교 : 문자열의 같다 비교
			result = this.personNumber.equals(person.personNumber);
		}
		return result; // (2) 여러번 리턴 만들지 않기 위해
	}

	public static void main(String[] args) {
		Person p1 = new Person("최예나", "900529-2020215");
		Person p2 = new Person("이바름", "900529-2020215");
		Person p3 = new Person("최예나", "111111-7777777");

		System.out.println("p1과 p2는 같은 사람인가? => " + p1.equals(p2));
		System.out.println("p1과 p3는 같은 사람인가? => " + p1.equals(p3));
	}

}
