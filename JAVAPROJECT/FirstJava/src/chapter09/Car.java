package chapter09;

public class Car extends Object {
	
	String name;
	Car (String name) {
		this.name=name;
	}
	
	

	
	public static void main(String[] args) {
	Car car1 = new Car();
	Car car2 = new Car();
	
	System.out.println(car1);   //  toString() ->  클래스의 풀네임@해시코드 16진수
	System.out.println(car2.hashCode());
	System.out.println(car2);
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
