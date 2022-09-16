package chapter03;

public class AssignmentOperator {

	public static void main(String[] args) {

		int num = 10;
		num += 5; // num = num + 5; => num = 10+5 => 15 [플러스 연산을 많이 사용함]
		System.out.println("num :" + num);
		num -= 3; // num =num -3 => num = 15-3 => 12
		System.out.println("num :" + num);
		num *= 2; // num = num * 2 => num = 12 * 2 => 24
		System.out.println("num :" + num);
		num /= 4; // num = num / 4 => num = 24/4 => 6
		System.out.println("num :" + num);
		num %= 4; // num = num %4 => num = 6%4 => 2
		System.out.println("num :" + num);

		String str = "안녕하세요.";
		str += "저는 최예나입니다.";
		str += "저는 학생입니다."; // 문자열이 길 경우에 이렇게 쓰기도 한다.

		System.out.println(str);

	}

}
