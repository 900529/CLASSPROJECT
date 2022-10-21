package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class Person {

	// Person 상위 클래스 정의
	// 이름을 저장하는 변수,
	// 주민번호 저장하는 변수를 정의하고
	// 인사하는 메소드 정의하자
	// "안녕하세요 저는 ~ 입니다. ~ 살입니다" 라는 문자열이 출력되도록 정의

	// (1)
	String name;
	String personNumber;

	// (2) 생성자 구성 : 필드를 이용하는 생성자 Generate Constructor using fields
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	// (4) 나이 변환하는 메소드, 주민번호는 멤버 변수 personNumber 활용
	int getAge() {

		// 반환하는 나이 값
		int result = 0;

		// 나이를 계산해서 반환하는 연산
		// 001212-111111
		// 990203-222222
		// 0123456789 ... 문자열의 index -> 문자들의 위치값
		// 태어난 년도 2자리
		String tempYear = personNumber.substring(0, 2); // substring (int beginindex, int endindex) 0부터 카운트, 앞자리까지 카운트라
														// 2
		String tempGender = personNumber.substring(7, 8); // 1,2,3,4

		// 891111-2000000
		// 010203-3000000
		// 1 || 2 => 1900 + 89
		// 3 || 4 => 2000 + 01

		// Integer.parseInt("문자열"); => int 정수 반환

		// 나이 구하기 : 올해년도 - 태어난년도
		// 방법(1) : int curYear = Calendar.getInstance().get(Calendar.YEAR);
		// Date -> LocalData, LocalDatetime, LocalTime 요즘은 이런 것들을 많이 사용!
		int curYear = LocalDate.now().getYear();

		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);

		if (genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birthYear);

		} else if (genderVal == 3 || genderVal == 4) {
			result = curYear - (2000 + birthYear);
		}

		return result;

	}

	// (3) 출력하는 메소드
	void printInfo() {
		System.out.printf("안녕하세요, 저는 %s입니다. %d살 입니다.", this.name, getAge());
	} // System.out.printf : 문자열을 서식문자를 이용하여 형식화된 내용으로 출력할 때 사용
		// %s 문자열형식, %d 정수형식

	// 날짜 테스트
	public static void main(String[] args) {

		LocalDate curDate = LocalDate.now();
		System.out.println(curDate);
		System.out.println(curDate.getYear());

		int curYear = LocalDate.now().getYear(); // 올해 년도

		// 인스턴스 테스트
		Person p = new Person("최예나", "001111-4000000");
		p.printInfo();
	}

}
