package ver01;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

		Contact con = new Contact("예나", "010-0000-0000", "yn@naver.com", "송파구", "5월1일");

		System.out.println("이름 : " + con.getName());
		System.out.println("번호 : " + con.getPhoneNumber());
		System.out.println("이메일 : " + con.getEmail());
		System.out.println("주소 : " + con.getAddress());
		System.out.println("생일 : " + con.getBirthday());
		System.out.println("그룹 : " + con.getGroup());

		con.showInfo();

		Scanner memberInfo = new Scanner(System.in);

		System.out.println("이름을 입력하시오");
		con.setName(memberInfo.nextLine());
		System.out.println("번호를 입력하시오");
		con.setPhoneNumber(memberInfo.nextLine());
		System.out.println("이메일을 입력하시오");
		con.setEmail(memberInfo.nextLine());
		System.out.println("주소를 입력하시오");
		con.setAddress(memberInfo.nextLine());
		System.out.println("생일을 입력하시오");
		con.setBirthday(memberInfo.nextLine());
		System.out.println("그룹을 입력하시오");
		con.setGroup(memberInfo.nextLine());

		con.showInfo();

	}

}
