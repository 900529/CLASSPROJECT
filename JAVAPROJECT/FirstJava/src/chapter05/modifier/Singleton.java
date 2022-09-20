package chapter05.modifier;

public class Singleton {

	// 외부에서 무분별한 인스턴스 생성을 막고,
	// + 객체지향에서 문제 : 참조변수를 유지하는 것이 어렵고, 계속 new 생성하게 됨 -> 제어하기 위해
	// 사용할 수 있는 인스턴스 하나를 만들어서 제공

	// 외부에서 인스턴스 생성을 하지 못하도록 처리
	// private

	private Singleton() {
	}

	// 2. 사용할 수 있는 인스턴스 생성
	// static 으로 시작 시점에 인스턴스 생성
	// 외부에서 참조변수 s에 직접 참조하지 못하도록 private
	private static Singleton s = new Singleton();

	// 3. 외부에서 사용할 수 있는 참조값을 반환해주는 메소드 제공
	// static 추가, 누구나 요청할 수 있도록 public
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

}
