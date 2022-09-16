package chapter03.exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // 사용자에게 데이터 받는

		System.out.println("숫자 1을 입력해주세요.>>> ");
		int num1 = in.nextInt(); // 정수로 받는

		System.out.println();

		System.out.println("숫자 2를 입력해주세요.>>> ");
		int num2 = in.nextInt();

		System.out.println("사칙 연산의 결과 ==========");
		addResultPrint(num1, num2);
		substractResultPrint(num1, num2);
		multiflyResultPrint(num1, num2);
		dividedResultPrint(num1, num2);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("원의 반지름을 입력해주세요.>>> ");
		double rad = in.nextDouble();

		System.out.println();

		System.out.println("원의 둘레 : " + circum(rad));
		System.out.println("원의 젋이 : " + area(rad));

	}

	/*
	 * 1. main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력 2. 콘솔에서 사용자에게 데이터를 받아 (입력) 메소드를
	 * 호출할 때, 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드 추가
	 */

	// ① 정수 두 개를 매개변수의 인자로 전달받아 / 더하기연산 후 출력하는 / 메소드 정의 (반환없음 void) / addResultPrint
	// 메소드 이름 설정 / 정수 long
	public static void addResultPrint(long num1, long num2) { // num = 10은 형변환
		// System.out.println("두 수의 덧셈 결과 : " + num1+num2); 더하기 때문에 앞부분이 더해지기 때문에 오류
		System.out.println("두 수의 덧셈 결과 : " + (num1 + num2)); // 두 수의 덧셈 결과 : 12
	}

	// ② 정수 두 개를 매개변수의 인자로 전달받아 / 빼기연산 후 출력하는 / 메소드 정의
	public static void substractResultPrint(long num1, long num2) {
		System.out.println("두 수의 뺄셈 결과 : " + (num1 - num2));
	}

	// ③ 정수 두 개를 매개변수의 인자로 전달받아 / 곱하기연산 후 출력하는 / 메소드 정의
	public static void multiflyResultPrint(long num1, long num2) {
		System.out.println("두 수의 곱셈 결과 : " + num1 * num2);

	}

	// ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드 정의
	public static void dividedResultPrint(double num1, double num2) {
		System.out.println("두 수의 나눗셈 결과 : " + num1 / num2);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 / 원의 둘레를 구해 / 반환하는 메소드를 반환하는 메소드 정의 반지름을 float,
	// 반환하는 double
	// 원 둘레 : 2 x π x r , r => 반지름 실수
	public static double circum(double r) {
		// 2 x π x r
		return 2 * 3.14 * r;
	}

	// ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 / 원의 넓이를 구해 / 반환하는 메소드를 반환하는 메소드 정의 (원 둘레 : 2 x π
	// x r , 월 넓이 : π x r x r)
	// 월 넓이 : π x r x r
	public static double area(double r) {
		return 3.14 * r * r;

	}

}
