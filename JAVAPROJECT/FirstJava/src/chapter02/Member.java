package chapter02;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String name = null; // 변수 초기화하는 것, 디폴트값 마지막에 쓰기 null
		int age = 0;
		String nickName = null;
		double height = 0.0;
		boolean hasBook = false;

		System.out.println("이름을 입력해주세요.>>> ");
		name = in.nextLine();

		System.out.println("나이를 입력해주세요.>>> ");
		age = in.nextInt();

		in.nextLine(); // 이게 왜 들어간거지?

		System.out.println("별명을 입력해주세요.>>>  ");
		nickName = in.nextLine();

		System.out.println("키를 입력해주세요.>>> ");
		height = in.nextDouble();

		System.out.println("책 보유여부를 입력해주세요.>>> ");
		hasBook = in.nextBoolean();

		// name = "최예나";
		// age = 33;
		// height = 167.5;
		// hasBook = true;

		System.out.println("저의 이름은" + name + "입니다.");
		System.out.println("나이는" + age + "입니다");
		System.out.println("별명은" + nickName + "입니다");
		System.out.println("키는" + height + "cm 이고,");
		System.out.println("자바 책의 보유 여부 : " + hasBook);

	}

	// 자기 자신의 이름을 출력하는 메소드
	// 반환타입 : 없다 => void
	// 매게변수 : 없다
	// 처리내용 : 자신의 이름을 출력한다.
	public static void printMyName(String name) {

		System.out.println("안녕하세요!! " + name + " 입니다.");

		// 반환이 있을 경우 -> return 사용해서 데이터 반환

	}

}
