package chapter05.exam;

public class MemberMain {

	public static void main(String[] args) {

		Member m1 = new Member("손흥민", "010-0000-0000", "축구", 1, "son@naver.com", 19850515, "서울");

		 m1.showMemberInfo();
		 
		 Member m2 = new Member("손흥민", "010-7000-0000", "체육", 2, "son2@naver.com");

		 m2.showMemberInfo();
	}

}
