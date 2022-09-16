package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {

		// 2 x 1 = 2
		// ....
		// 2 x 9 = 18
		// 3 x 1 = 3
		// ...
		// 9 x 9 = 81
		// 단의 반복 : 2~9

		// for (int i = 1 ; i <=9 ; i++) {
		// System.out.println("2 x " + i + "=" + (2*i) );

		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			System.out.println("--------------------------");
			for (int j = 1; j <= 9; j++) { // i 를 또 사용하지 않음
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println("--------------------------");
		}
	}

}
