package chapter09.exam;

public class PersonPractice {

	// Person 클래스의 equals() 메소드를 오버라이딩해서
	// 주민번호가 같으면 같은 인스턴스로 판별하는 프로그램 만들어보자! "000000-0000000"
	// 변수언급
	String name;
	String personNumber;
	
	// 생성자
	public PersonPractice(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false; // 정리해주고, 
				Object PersonPractice;
				if (obj != null && obj instanceof PersonPractice) {
					PersonPractice personPractice = (PersonPractice) obj;
				result = this.personNumber.equals(PersonPractice.personNumber); // 왜 오류지?
	}
		return result;
	}
	
 public static void main(String[] args) {
	
}
	 
	
	
	
}
