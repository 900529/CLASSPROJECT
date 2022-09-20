package chapter05;

public class MemberMain {

	public static void main(String[] args) {

		Member member1 = new Member ()
						"최예나", 
						"010-0000-0000", 
						"역사", 
						4, 
						"yena@daum.net", 
						"5월29일", 
						"서울시 송파구");
		member1,printMemberData();
		

		System.out.println("==================");

		Member member2 = new Member("이바름", "010-0000-0000", "영어", 3, "br@naver.com");
		member2.printMemberData();

	}

}
