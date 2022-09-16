package chpater04.exam;

public class Exam01 {

	public static void main(String[] args) {
		// 문제 1.
		// for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램 작성

		// ((((1*2)*3)*4)...*10)

		int result = 1; // 계속 곱해나가야되니 0은 안됨!
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			// System.out.println(i);
			// result = result * i;
			result *= i;
			System.out.println(i + " : " + result + "n");

		}

	}

}
