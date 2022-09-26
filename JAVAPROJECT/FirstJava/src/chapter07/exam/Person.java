package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class Person {

	// Person 클래스 정의
	// (1) 이름을 저장하는 변수,
	// 주민번호 저장하는 변수 정의해봅시다.
	// (2) 인사하는 메소드 정의
	// "안녕하세요 저는 ~ 입니다. ~ 살입니다"라는 문자열이 출력되도록!

	String name;
	String personNumber;

	// 생성자 구성
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// 나이를 변환하는 메소드, 주민번호는 멤버 변수인 personNumber 값을 이용해서 처리
	int getAge() {

		// 반환하는 나이 값
		int result = 0;

		// 나이를 계산해서 반환하는 연산
		// 001212-1111111
		// 990203-222222
		// 0123456789 ... 문자열의 index -> 문자들의 위치값
		// 태어난 년도 2자리

		String tempYear = personNumber.substring(0, 2); // "00", "99" 눌러서 확인 substring (int beginindex, int endindex)
		String tempGender = personNumber.substring(7, 8); // 1, 2,3,4

		// 891111-2000000
		// 010203-3000000
		// 1 || 2 => 1990 + 89
		// 3 || 4 => 2000 + 01

		// Integer.parseInt("문자열"); => int 정수 반환

		// 나이 구하기 : 올해년도 - 태어난 년도
		// 방법(1) : int curYear = Calendar.getInstance().get(Calendar.YEAR); // 클릭 확인
		// Data -> LocalData, LocalDatetime, LocalTime
		int curYear = LocalDate.now().getYear();

		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);

		if (genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birthYear);

		} else if (genderVal == 3 || genderVal == 4) {
			result = 2000 + birthYear;
		}

		return result;

	}

	void printInfo() {
		System.out.printf("안녕하세요, 저는 %s입니다. %d살 입니다.", this.name, getAge()); // printf %s %d
	}

	public static void main(String[] args) {

		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		System.out.println(curDate.getYear());

		int curYear = LocalDate.now().getYear(); // 올해 년도

		Person p = new Person("최예나", "001111-4000000");
		p.printInfo();
	}

}
