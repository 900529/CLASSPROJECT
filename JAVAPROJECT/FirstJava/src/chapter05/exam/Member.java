package chapter05.exam;

public class Member {

	// 이름, 번호, 전공, 학년, 이메일, 생일, 주소 데이터 저장
	// 정보 출력하는 메소드 정의
	// (1) 모든 정보 저장하는 생성자 (2)생일, 주소는 저장하지 않을 수 있는 생성자 정의
	// 메인메소드에서 두가지 생성자 이용해서 인스턴스 생성하고, 출력 메소드 통해 저장된 데이터 출력

	// 변수 선언
	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private int birthday;
	private String address;

	// 생성자(1)
	public Member(String name, String phoneNumber, String major, int grade, String email, int birthday,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	// 생성자(2)
	public Member(String name, String phoneNumber, String major, int grade, String email) {
		this(name, phoneNumber, major, grade, email, 0, null);
		// this.name = name;
		// this.phoneNumber = phoneNumber;
		// this.major = major;
		// this.grade = grade;
		// this.email = email;

	}

	// 메소드
	public void showMemberInfo() {
		System.out.println("회원 정보 =======");
		System.out.println("이름 : " + this.name);
		System.out.println("전화 : " + this.phoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("이메일 : " + this.email);
		System.out.println("생일 : " + (this.birthday == 0 ? "미입력" : this.birthday)); // 삼항연산자
		System.out.println("주소 : " + (this.address == null ? "미입력" : this.address));
		// if (this.birthday != 0 && this.address != null)) { // 단, 제대로 생일을 8자리로 입력했을
		// 경우로 가정하고~
		// System.out.println("생일 : " + this.birthday);
		// System.out.println("주소 : " + this.address);

	}

}
