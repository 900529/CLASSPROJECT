package chapter08;

public abstract class AbstractClass {

	// 추상클래스 : 멤버 중 추상메소드가 하나라도 존재하면 추상클래스가 된다.
	// abstract 키워드로 추상클래스임을 정의
	// 추상클래스는 미완성된 클래스이므로 인스턴스 생성 불가능
	// 추상클래스의 정의 목적은?
	// 상속을 통해 미완성된 메소드를 완성해서 새로운 클래스를 정의하는데 도움을 주는 목적

	int num;
	String name;

	void printData() {
		System.out.println(num + ", " + name);

	}

	// 추상메소드 : 메소드의 정의만 하고 처리부는 완성하지 않은 메소드
	abstract void abstractMethod();

	// 코드만 보면 완성되지 않았지만, 인스턴스는 만들어서 실행하니~ 
	// 이 안에 추상메소드를 넣어서 활용~ 
	void instanceMethod() {
		abstractMethod();
	}

}
