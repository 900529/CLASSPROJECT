package chapter08.phone;

// 클래스 생성시 : SuperClass 상속받을 때 Computers
// InterFaces 인터페이스 구현할 때 Phone~ : 여러개 선택 가능 

public class SmartPhone extends Computer implements Phone {

	boolean power;

	public SmartPhone(String account) {
		super(account);
		this.power = false;
	}

	@Override
	public void call() {
		// 119에 전화를 합니다.
		// 상수를 이용해서 번호를 만들고 출력
		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);

		System.out.println(number1 + number1 + number9 + "에 전화를 합니다. 불났어요!!");
	}

	@Override
	public void turnOn() {
		// true : 전원이 있는 상태
		// false : 전원이 없는 상태
		if (!power) { // ! 없으면 실행 안됨
			power = true;
		}
	}

	@Override
	public void turnoff() {
		if (power) {
			power = false;
		}
	}

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("choired0529@naver.com");
		phone.call();
		phone.calculator();

	}

}