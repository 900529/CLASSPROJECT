package chapter05;

public class MemberMain {

	// 메인 메소드
	public static void main(String[] args) {

		Member m1 = new Member("최예나", "010-0000-0000", "국사", 4, "yena@naver.com", 20000101, "서울시");
		// 가독성 떨어질 경우 아래 한줄씩 넣고, 주석 넣기도함~
		m1.showMemberInfo();

		Member m2 = new Member("이바름", "010-0000-0000", "영문", 3, "baruem@naver.com");
		m2.showMemberInfo();

	}

}
