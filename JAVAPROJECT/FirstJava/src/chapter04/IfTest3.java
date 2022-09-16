package chapter04;

public class IfTest3 {

	public static void main(String[] args) {

		// 97~100 : A+
		// 94~96 : A
		// 90~ 93 : A-
		// 80점대 B, B+, B-
		// 70점대 C, C+, C-
		// 나머지 F
		// 조건문의 중첩

		int score = 60;
		String result = "F";

		if (score >= 90) {
			result = "A";
			// 100 ~ 97 : A+
			if (score > 97) {
				result = result + "+"; // 짧게 바꾸는 방법 result + = "+";
			}
			// 90 ~ 93 : A-
			if (score < 94) {
				result += "-";

			} else if (score >= 80) {
				result = "B";
				if (score > 87) {
					result += "+";
				} else if (score <= 83) {
					result += "-";
				}

			} else if (score >= 70) {
				result = "C";

				if (score > 77) {
					result += "+";
				} else if (score < 74) {
					result += "-";
				}

				// if {result= "f"; }
			}
		}
		System.out.println("학점 : " + result);
	}
}
