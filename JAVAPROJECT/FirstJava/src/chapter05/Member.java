package chapter05;

public class Member {

	/*
	 * Member 클래스에 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과 확인 단 인스턴스의
	 * 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다. ① 아래의 데이터를 저장 [이름, 전화번호, 전공, 학년, email, 생일,
	 * 주소] ② 위에서 정의한 정보를 출력하는 메소드 정의 ③ 모든 정보를 저장하도록 하는 생성자 + 생일과 주소는 저장하지 않을 수 있는
	 * 생성자 정의 ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	 */

	// 변수 선언
	private String name;
	private String phoneNumber;
	private String major;
	private int grade; // 숫자인 학년
	private String email;
	// 생일 표현 : 문자열? 정수? : 19900101 20020101
	private int birthday;
	private String address;

	// 생성자 (1) (2)
	public Member(String name, String phoneNumber, String major, int grade, String email, int birthday,
			String address) {
		super(); // 상속하게되면 부모 클래스 호출 키워드, 지금은 없어도됨
		// 위에 보이지 않는 클래스 public class Member (extends Objects) 생략됐음
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, int grade, String email) {
		// super(); 상속하게되면 부모 클래스 호출 키워드, 지금은 없어도됨
		// 위에 보이지 않는 클래스 public class Member (extends Objects) 생략됐음
		this(name, phoneNumber, major, grade, email, 0, null); // 생일, 주소 null
		// 아래 내용대로 해도 됨
		// this.name = name;
		// this.phoneNumber = phoneNumber;
		// this.major = major;
		// this.grade = grade;
		// this.email = email;
		// this.birthday = birthday;
		// this.address = address;
	}

	// 정보 출력하는 메소드
	public void showMemberInfo() {
		System.out.println("회원 정보==========");
		System.out.println("이름 : " + this.name);
		System.out.println("전화 : " + this.phoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("이메일: " + this.email);
		System.out.println("생일: " + this.birthday);
		// 삼항연산자 연습 : 
		// System.out.println("생일: " + (this.birthday==0? "미입력" : this.birthday));
		// 산술연산자가 삼항연산자보다 먼저 오니까 this 앞 괄호는 꼭 넣을 것
		System.out.println("주소: " + this.address);
		// System.out.println("주소: " + (this.address==null?"미입력" : this.address));
		
		// 안넣을 경우 생일이 무조건 0이니까,
		// if(this.birthday!=0 && this.address!=null) {
		// System.out.println("생일: " + this.birthday);
		// System.out.println("주소: " + this.address);
		
	}

}
