package chapter06.exam;

public class StudentsMain {

	public static void main(String[] args) {

		// 학생 10명의 정보를 저장하는 배열 
		Students[] students = new Students[10];

		// 점수 초기화 (랜덤으로)
		for (int i = 0; i < students.length; i++) {
			students[i] = new Students("학생" + i, (int) (Math.random() * 51) + 50, (int) (Math.random() * 51) + 50,
					(int) (Math.random() * 51) + 50);
		}

		int korTotalScore = 0;
		int engTotalScore = 0;
		int matTotalScore = 0;

		System.out.println("성적표");
		System.out.println("==================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("==================================");

		for (Students s : students) {
			s.printData();
			korTotalScore += s.getKorScore();
			engTotalScore += s.getEngScore();
			matTotalScore += s.getMatScore();
		}
		System.out.println("==================================");
		System.out.printf("과목총점\t%d \t %d \t %d \n", korTotalScore, engTotalScore, matTotalScore);

		System.out.printf("과목평균 \t%.1f  \t %.1f  \t %.1f  \n", korTotalScore / 10f, engTotalScore / 10f,
				matTotalScore / 10f);
		System.out.println("==================================");

	}

}
