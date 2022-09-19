package chapter05;

public class MemberMain {

	public static void main(String[] args) { 
	
	Member member1 = new Member ("최예나", "010-0000-0000", "역사", 4, "yena@daum.net", "5월29일", "xx시 xx구");
	Member member2 = new Member ("이바름", "010-0000-0000", "영어", 3, "br@naver.com");

		member1.pintMemberData();
		System.out.println("=================");
		member2.pintMemberData();
			
	}

}
