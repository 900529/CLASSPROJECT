package chapter08;

public class OuterClass2 {
	
	// 생산자 단축키는? 

	private String name;
	
	
	
	public void createLocalClassInstance() {
		// Local Class 메소드 내부에 선언되어 사용되는 클래스
		// 외부 클래스에서는 내부 클래스를 참조할 수 없다
		// 상속의 구조로 다형성 이용해서 외부에서 사용할 수 있도록 정의 
		class LocalClass extends BasicClass {
			void tell () {
				System.out.println("안녕하세요" + name + "입니다.");
			}
		}
	
		return new LocalClass();
				
	// 메소드 내부에서 내부 클래스를 이용한 인스턴스 생성은 언제나 가능!
	// new LocalClass().tell();
	}
	 
	public static void main(String[] args) {
	OuterClass2 o = new OuterClass2("King");
	
	o.createLocalClassInstance();
	}

	public OuterClass2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OuterClass2(String name) {
		super();
		this.name = name;
	}

	public OuterClass2(String name) {
		super();
		this.name = name;
	}
	
	
	
}
