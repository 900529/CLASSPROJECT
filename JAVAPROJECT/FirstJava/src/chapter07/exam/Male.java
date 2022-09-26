package chapter07.exam;

public class Male extends Person {

	String nickName;

	Male(String name, String pNum, String nickName) {
		super(name, pNum); // 상위 클래스 생성자 호출 
		this.nickName = nickName;
	}

	// 메소드 
	void hi() {
		System.out.println("안녕하세요!");
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("별명은" + nickName + "입니다.");
	}

}
