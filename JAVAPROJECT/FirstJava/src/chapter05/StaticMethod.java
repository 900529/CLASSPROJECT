package chapter05;

public class StaticMethod {

	static int num1 = 10; // 클래스 변수
	int num2; // 인스턴스 변수

	static void staticMethod() {
		System.out.println("staticMethod");
		// System.out.println(num2); // 인스턴스 생성없이 사용 불가
		// 클래스 맴버에 인스턴스 맴버는 사용불가!
		// static은 시작될때 만들어짐, num2는 현재 존재하지 않음
		StaticMethod sm = new StaticMethod();
		sm.instanceMethod(); // 윗줄 내용 넣어야 오류가 안나옴
	}

	void instanceMethod() {
		System.out.println("instanceMethod");
		System.out.println(num1);
		staticMethod();
	}

}
