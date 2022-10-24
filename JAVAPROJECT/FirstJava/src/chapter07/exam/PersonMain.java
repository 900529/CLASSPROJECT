package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {

		Male m = new Male("이바름", "890627-1028985", "닥스훈트");
		Female f = new Female("최예나", "901223-2000000", "언론홍보", 2);

		m.printInfo();
		m.hi();

		System.out.println();

		f.printInfo();

		System.out.println();
		System.out.println();
		f.printSchoolInfo();

		Person p1 = (Person) m;
		Person p2 = f;
		
		// p1.hi(); // hi()는 Person 클래스의 멤버가 아니기 때문에 호출 불가능  
		// p2.printSchoolInfo(); 이것도 호출 불가능 
		
		System.out.println();
		System.out.println("==========================");
		p2.printInfo(); // 오버라이딩된 메소드는 호출 가능 

	}

}
