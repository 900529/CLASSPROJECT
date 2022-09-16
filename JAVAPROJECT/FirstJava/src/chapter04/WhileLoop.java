package chapter04;

public class WhileLoop {

	public static void main(String[] args) {

		// 5번 "JAVA"를 출력하는 코드 작성
		// 5번 출력문 실행

		// System.out.println("JAVA");
		// System.out.println("JAVA");
		// System.out.println("JAVA");
		// System.out.println("JAVA");
		// System.out.println("JAVA");
		/*
		 * 반복 체크할 변수 while(반복의 조건 : 변수체크) { 반복해야할 코드 변수 증감 연산식 }
		 */
		int count = 0; // 0 1 2 3 4 5

		while (count++ < 5) { // 0
			System.out.println("JAVA");
			break;

			// 반복문을 탈출할 수 있는 증감식 필요
			// count = count + 1 ;
			// count + = 1;
			// count++;
			// ++count;\
		}

	}
}
