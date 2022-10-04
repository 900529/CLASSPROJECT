package chapter11;

// 제네릭 타입의 메소드
// public <타입 파라미터> 반환타입 메소드이름(<타입 피라미터> 변수이름, ...) {...} 

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {   // 왜 오류가 나오지?

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}

	public static void main(String[] args) {

		MyInterfaceImpl<String, Integer> myClass = new MyInterfaceImpl<String, Integer>(); // 참조형 타입이 와서 정리해야함

		System.out.println(myClass.method1("Ten"));
		System.out.println(myClass.method2(10));

	}

}
