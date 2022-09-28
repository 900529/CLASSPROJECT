package chapter08;

public class OuterClass2 {

	private String name;

	// 생산자 Generate Constructor using Fields
	public OuterClass2(String name) {
		super();
		this.name = name;
	}

	public BasicClass createLocalClassInstance() {

		// Local Class : 메소드 내부에서 선언되어 사용되는 클래스
		// 외부 클래스에서는 내부 클래스 참조 불가능
		// 상속의 구조로 다형성 이용해서 외부에서 사용할 수 있도록 정의
		class LocalClass extends BasicClass {
			void tell() {
				System.out.println("안녕하세요" + name + "입니다.");

			}
		}
		return new LocalClass();
		// 메소드 내부에서 내부 클래스를 이용한 인스턴스 생성 가능!!
		// new LocalClass().tell();

	}

	public static void main(String[] args) {
		OuterClass o = new OuterClass("KING");
		BasicClass localClassInst =   o.createLocalClassInstance();
		localClassInst.tell();

	}
}

abstract class BasicClass {
	abstract void tell();

}
