package chapter05;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
	    // 더하기, 곱하기 프로그램
		Calculator cal = new Calculator(); // import 안하는 이유, 같은 패키지 안에 있어서 안해도됨 
	
		Scanner in = new Scanner (System.in);
	
		System.out.println("숫자 1 > > " );
		int num1 = in.nextInt();
		
		System.out.println();
	
		System.out.println("숫자 2 > > " );
		int num2 = in.nextInt();
			
		// 더하기, 곱하기 연산의 결과 
		System.out.println();
		System.out.println("더하기 곱하기 연산의 결과");
		System.out.println("num1 + num2의 결과는 : " + cal.add(num1, num2) );
		System.out.println("num1*num2의 결과는 : " +cal.multifly(num1, num2) );
	
		
	}

}
