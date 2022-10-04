package chapter11;

// 제네릭 클래스 

public class Box { 

	// 과일 종류가 여러개면 메소드 다 만들지 못한다! 그럴 경우~
	void push(Orange o) {
	 o.print();
	}

	void push(Apple a) {
	 a.print();
		}

//	void push(Object o) {
	//	System.out.println(o);
//	} // 박스 들어올때 타입을 정해주는 클래스 제작 
	

	public static void main(String[] args) {
		Box box = new Box();
		box.push(new Orange());
		box.push(new Apple());
	//	box.push(new String (" Apple"));
	
	}
}

// 객체 
class Apple {
	void print() {
		System.out.println("Apple");
	}
}

class Orange {
	void print() {
		System.out.println("Orange");
	}
}
