package chapter07;

public class SmartPhone extends Phone {

	// 하위 클래스 : 상위 클래스 멤버 + 새로운 멤버 정의
	String model;

	SmartPhone() {
		super("010-1111-3333"); // 상위 클래스 성성자 호출 1번
		this.model = "IOS"; // 3번 _ 요고 순서 이해함?
	}

	// 전화번호만 초기
	SmartPhone(String phoneNumber) {
		super(phoneNumber);
		this.model = "android";
	}

	SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	void play() {
		System.out.println("app을 실행합니다.");
	}

	public static void main(String[] args) {

		// SmartPhone sp = new SmartPhone(); // 선생님 1,2,3,4 순서 이해할 것
		// SmartPhone sp = new SmartPhone("010-1111-5555");
		SmartPhone sp = new SmartPhone("010-7427-0529", "Google");

		System.out.println(sp.phoneNumber);
		sp.call();

		System.out.println(sp.model);
		sp.play();

	}

}
