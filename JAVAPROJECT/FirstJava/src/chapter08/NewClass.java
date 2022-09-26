package chapter08;

public class NewClass extends AbstractClass {

	String nickname;

	// 추상클래스를 상속하고 추상메소드를 구현하지 않으면,
	// 새로운 클래스도 추상 클래스가 된다.
	// NewClass도 인스턴스 생성이 불가능
	// 인스턴스 생성을 목적으로 한다면 추성메소드를 오버라이딩해서 완성시켜야된다.

	// 추상메소드 : 메소드의 정의만 하고 처리부는 완성하지 않은 메소드
	// 추상메소드를 오버라이딩 통해 완성키신다.

	void abstractMethod() {
		System.out.println("추상메소드를 오버라이딩해서 완성된 메소드");
	}
}
