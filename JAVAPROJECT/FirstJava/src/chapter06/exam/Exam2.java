package chapter06.exam;

public class Exam2 {

	// Exam1 연습
	public static void main(String[] args) {
		// 국, 영, 수 점수 10개씩 저장하는 배열 정의하고
		// 점수 모두 출력하고
		// 평균 점수를 출력하는 프로그램을 작성해보자!

		int[][] scores = new int[10][3];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				// System.out.println(scores[i][j]); 여기는 출력목적이 아니니 생략
				int num = (int) (Math.random() * 51) + 50; // 0+50<=num<=50+50
				scores[i][j] = num;

			}
		}

		System.out.println("성적표");
		System.out.println("=====================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================");

		int korTotal = 0;
		int engTotal = 0;
		int matTotal = 0;

		// 이건 출력문
		for (int i = 0; i < scores.length; i++) {

			int sum = 0;

			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];

				// 국어 점수일 때
				if (j == 0) {
					korTotal += scores[i][j];
				}

				// 영어 점수일 때
				if (j == 1) {
					engTotal += scores[i][j];
				}

				// 수학 점수일 때
				if (j == 2) {
					matTotal += scores[i][j];
				}
			}

			System.out.print(sum + "\t" + (float) sum / scores[i].length); // 옆에 이어서 출력해야되니 print // 평균구할때 형변환

			System.out.println();

			// 국영수 한줄을 표현하는 for 문
			System.out.println();

		}
		System.out.println("=====================");
		System.out.print(korTotal +"\t" + engTotal + "\t" + matTotal);
		System.out.println();
		System.out.print((float)korTotal/scores.length + "\t" + (float)engTotal/scores.length +"\t" +(float)matTotal/scores.length);
		

	}
}
