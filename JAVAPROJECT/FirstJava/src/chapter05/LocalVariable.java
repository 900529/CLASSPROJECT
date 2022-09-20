package chapter05;

public class LocalVariable {

	void method(int num) {
		// 매개변수도 지역변수

		int lv = 10; // 메소드 내부에서 선언되는 변수도 지역변수

		if (num > 10) {
			boolean check = true; // 지역변수
		} else {
			boolean check = false; // 지역변수에서 똑같이 check는 당연히 안되지만 되는 이유는? 참, 반대가 다르게 움직이니~
		}
		// int lv = 100;

		for (int i = 0; i < 10; i++) {
			// i는 for 블록 안에서만 사용가능한 지역변수
		}
		
		while 
		
		
	}

	public static void main(String[] args) {

		LocalVariable lv = new LocalVariable();
		lv.method(0);

	}

}
