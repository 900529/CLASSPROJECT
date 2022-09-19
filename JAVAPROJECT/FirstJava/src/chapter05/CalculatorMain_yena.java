package chapter05;

import java.util.Scanner;

public class CalculatorMain_yena {

	public static void main(String[] args) {

		// 더하기, 곱하기 프로그램
		Calculator cal = new Calculator();
		// 같은 패키지 안에 클래스 있음 따로 임폴트 안해도 찾아간다.
		// 다른 패키지에 칼큘레이터 있음 써야했음

		Scanner in = new Scanner(System.in);
		// 인스턴스이지만 뒤에 생성자 이용해서 값 넣고, 변수를 넣어 초기화
		// 생성자 내용

		System.out.println("숫자 1 >>");
		int num1 = in.nextInt();

		System.out.println();

		System.out.println("숫자 2 >>");
		int num2 = in.nextInt();

		// 더하기, 곱하기 연산의 결과
		System.out.println("더하기 곱하기 연산의 결과");
		System.out.println("num1+num2의 결과는 " + cal.add(num1, num2));
		System.out.println("num*num2의 결과는 " + cal.multifly(num1, num2));
	}

}
