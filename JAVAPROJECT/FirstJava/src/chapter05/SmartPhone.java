package chapter05;

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
	// * 중요 : 메소드에서 { 선언, 이번에는 스마트폰 옆에 클래스 블럭에서 바로 { 넣기

	String color; // 메소드 안 변수가 아닌 "인스턴스 변수" : 파랑색으로 바뀜, 메모리 저장 공간이 다름, 인스턴스 생성시 초기화 생략 가능
	// String color = "검정"; 기본값으로 가져갈 경우 초기화 넣는 경우도 있음
	float size; // 0.0
	String company; // null
	int volumeSize; // 초기값 0

	// 전화걸기
	void call() {
		System.out.println("전화 걸기!");
	}

	// 볼륨 키우기
	void volumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volumeSize++; // 초기값 0에다 1씩 증가
	}

	// 볼륨 줄이기
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;
	}

	void showInfo() {
		System.out.println("폰정보");
		System.out.println("제조사 : " + company);
		System.out.println("색상 : " + this.color); // 인스턴스의 맴버를 가르키는 키워드 this
		System.out.println("사이즈 : " + size);
		System.out.println("불륨 크기 : " + volumeSize);
		// 어디에 있는 변수를 쓰느냐 맴버 위에 있는 내용 그대로~

	}

}
