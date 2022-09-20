package chapter05.modifier;

public class PrivateTest {

	private String name;
	private int age;
	
	public PrivateTest() {   // 단축키 눌러서 하는 방법? 
		this.name = "최예나";
		this.age = 33;
	}
	 
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
	
	 
	
	
	
}
