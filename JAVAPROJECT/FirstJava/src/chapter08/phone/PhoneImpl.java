package chapter08.phone;

public class PhoneImpl implements Phone {
//  phone 추상메소드가 3개가 있으니 오버라이딩 되어야 오류가 바로 안보임

	boolean power;

	@Override
	public void call() {
		// 119에 전화를 합니다.
		// 상수를 이용해서 번호를 만들고 출력
		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);

		System.out.println(number1 + number1 + number9 + "에 전화를 합니다. 불났어요!!");

		// System.out.println(Phone.PHONE_NUM_1+Phone.PHONE_NUM_1+Phone.PHONE_NUM_9);
		// //119가 아닌 더하기로 될 수 있음

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

}
