package chapter05;

public class Calculator {

	// 기능만 제공하는 클래스 : 사칙연산
	long add(long num1, long num2) {
		return num1 + num2;
	}

	// 메소드의 오버로딩 : 같은 이름의 메소드를 정의하는 것
	// 오버로딩의 조건 : 매개변수의 타입이 다르거나, 매개변수의 개수가 다를때 가능
	// 메소드의 구분은 메소드 호출시의 정의되는 매개변수 인자 값에 따라서 메소드가 선택된다.
	// 메소드이름 (문자열 값, 정수 값, 정수 값)

	// 오버로딩 메소드 정의
	float add(float num1, float num2) {
		return num1 + num2;
	}

	// float add (float num1, float num2) {
	// return n1+n2;
	// }

	// cal.add(1.0f, 2.0f)

	int add(int num1, int num2) { // 타입을 정리하는 것이기 때문에 가능
		return num1 + num2;
	}

	long add(int num1, long num2) {
		return num1 + num2;
	}

	long add(long num1, int num2) {
		return num1 + num2;
	}

	// void add (int num1, int num2) {
	// System.out.println(num1+num2);
	// }

	long multifly(int num1, int num2) {
		return num1 * num2;
	}

}
