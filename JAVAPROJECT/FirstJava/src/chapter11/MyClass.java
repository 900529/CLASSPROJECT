package chapter11;

public class MyClass<T> {

	T val;

	// 반환도 T 
	T getVal() {
		return val;
	}

	void setVal(T Val) {
		this.val = val;
	}

	public static void main(String[] args) {

		// 제네릭 클래스는 인스턴스 생성시에 타입을 결정한다.
		MyClass<String> myClass = new MyClass<String>();
		String str = myClass.getVal(); // String 타입 반환하는 메소드로 정리되있으니~ 

		myClass.setVal("KING");
		System.out.println(myClass.getVal());

	}

}
