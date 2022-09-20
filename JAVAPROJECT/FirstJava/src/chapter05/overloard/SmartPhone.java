package chapter05.overloard;

// 클래스는 인스턴스를 생성하기 위한 설계도 역할
// 클래스에서 정의한 변수, 메소드는 바로 사용 불가 : 메인메소드 안넣은 이유
// 클래스로 인스턴스 만들어서 사용!
// class 정의는 class 키워드를 사용해서 정의!

// 경우에 따라서 public 생략 
public class SmartPhone {
	// 스마트폰 인스턴스를 만들기 위한 설계도 역할
	// 이 다음 class 앞에는 public 붙일 수 없다.

	// 클래스 : 변수와 메소드로 구성
	// 생성자 : 필수지만 생략 가능

	// 클래스의 맴버 : 변수, 메소드
	// 클래스 내부에 정의된 변수 : 맴버 변수, 인스턴스 변수
	// 클래스 내부에 정의된 메소드 : 맴버 메소드, 인스턴스 메소드

	// 스마트 폰의 속성 : 컬러, 사이즈, 제조사, 불륨 사이즈
	// 속성 => 변수
	// * 중요 * 메소드 쪽에서 { 선언, 이번에는 스마트폰 옆에 클래스 블럭에서 바로 { 넣기

	String color; // 메소드 안 변수가 아닌 "인스턴스 변수" : 파랑색으로 바뀜, 메모리 저장 공간이 다름, 인스턴스 생성시 초기화 생략 가능
	// String color = "검정"; 기본값으로 가져갈 경우 초기화 넣는 경우도 있음
	float size; // 0.0
	String company;
	int volumeSize; // 초기값 0

	// 생성자 : 인스턴스 생성시에 단 한번 실행하는 초기화 메소드
	// 클래스 이름 (매개변수...) {
	// 초기화 코드
	// }

	SmartPhone() {
		// 매개변수 없고, 처리 내용이 없는 생성자 = > 기본 생성, 생략 가능
	}

	// 생성자의 오버로딩 : 같은 이름의 생성자 정의
	SmartPhone(String color, float size, String company, int volumSize) {
		// 인스턴스를 생성하면 this 참조변수도 생성
		// this는 현재 인스턴스 자신의 주소값을 가지는 변수
		this.color = color;
		this.size = size;
		this.company = company;
		this.volumeSize = volumeSize; // 초기화 해주는 것
	}

	SmartPhone(String company, float size) {
		// this.company = company;
		// this.size = size;
		// this.color = color;
		this("black", size, company, 10);
	}

	SmartPhone(String company) {
		// this.company = company;
		// this.size = 4f;
		// this.color = black
		// this.vplumesize=10;;
		this("black", 4f, company, 10);
	}

	// 전화걸기
	void call() {
		System.out.println("전화 걸기!");
	}

	// 볼륨 키우기
	void VolumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volumeSize++; // 초기값 0에다 1씩 증가
	}

	// 볼륨 줄이기
	void VolumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;
	}

	void showinfo() {
		System.out.println("폰정보");
		System.out.println("제조사 : " + company);
		System.out.println("색상 : " + this.color); // 인스턴스의 맴버를 가르키는 키워드 this
		System.out.println("사이즈 : " + size);
		System.out.println("불륨 크기 : " + volumeSize);
		// 어디에 있는 변수를 쓰느냐 맴버 위에 있는 내용 그대로~
	}

	public void showInfo() {
		// TODO Auto-generated method stub

	}

}
