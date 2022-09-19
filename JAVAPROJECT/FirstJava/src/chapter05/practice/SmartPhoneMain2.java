package chapter05.practice;

public class SmartPhoneMain2 {

	// 인스턴스 생성할때마다 개별(독립)적인 메모리 공간이 생김
	// 클래스 내부에서 정의한 변수들도 인스턴스 생성과 동시에 생성
	// 참조 변수는 주소값만 가지는 것! 다른 의미를 부여하지 말 것

	public static void main(String[] args) {

		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();

		// 참조변수의 주소값 비교

		System.out.println("sp1 주소 == sp2 주소 : " + (sp1 == sp2));

		// 별도의 메모리 공간이니, 두개는 다를 수 밖에

		sp1.showInfo();
		sp2.showInfo();
		// 초기값이라 정보가 같지만 서로 다름!

		////////////////////////////////////

		// 각 인스턴스의 속성값 적용
		sp1.company = "APPLE ";
		sp1.color = "SILVER";
		sp1.size = 5.0f;
		sp1.volumeUp();
		sp1.volumeUp();

		sp2.company = "SAMSUNG";
		sp2.color = "RED";
		sp2.size = 5.4f;
		sp1.volumeUp();
		sp1.volumeUp();
		sp1.volumeUp();
		sp1.volumeUp();

		System.out.println("각 인스턴스를 설정 후 데이터 출력");
		sp1.showInfo();
		sp2.showInfo();

		/////////////////////////////////

		sp2 = sp1;
		// 매개변수 : 메소드에서 정의
		// int num1, int num2
		// SmartPhone sp

		System.out.println();
		sp1.showInfo();
		sp2.showInfo();
		// sp2도 애플로~ 1의 정보와 동일해짐

		showPhoneInfo(sp1);

	}

	public static void showPhoneInfo(SmartPhone sp) {
		System.out.println("매개변수를 참조변수로 정의해서 메소드 내부에서 객체 참조");
		sp.showInfo();
	}

}
