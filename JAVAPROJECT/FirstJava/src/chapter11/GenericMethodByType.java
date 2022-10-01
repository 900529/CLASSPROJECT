package chapter11;

import chapter08.test.Phone;
import chapter08.test.PhoneImpl; // 이건 내가 직접 입력한건데, 어찌하는겨?!!

public class GenericMethodByType {

	public <T extends Phone> void hello(T t) {
		// System.out.println("안녕하세요" + t.toString() + "입니다.");
		t.call();
	}

	public static void main(String[] args) {

		GenericMethodByType byType = new GenericMethodByType();
		// byType.<String>hello("최예나");
		// byType.hello(10); //String 뺀 이유?
		// byType.<PhoneImpl>hello(new PhoneImpl());
		// byType.hello(new PhoneImpl());
		// byType.hello("스마트폰");

	}

}
