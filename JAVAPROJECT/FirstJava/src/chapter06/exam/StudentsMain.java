package chapter06.exam;

public class StudentsMain {

	public static void main(String[] args) {

		// 학생 10명의 정보를 저장하는 배열
		Students[] students = new Students[10];

		// 점수 초기화
		for (int i = 0; i < students.length; i++) {
			students[i] = new Students("학생" + i,
					(int) (Math.random() * 51) + 50, 
					(int) (Math.random() * 51) + 50,
					(int) (Math.random() * 51) + 50);

			for (Students s : students) {
				s.printData();
			}

		}

	}

}
