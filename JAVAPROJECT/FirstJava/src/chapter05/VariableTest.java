package chapter05;

public class VariableTest {

	int iv = StaticVariable.cv;
	int iv2;
	
	static int cv; // int 없을 경우 오류가 남. cv와 staticVariable cv는 다름  
	
	
	public static void main(String[] args) {

		// 클래스 변수를 참조할 때는 클래스이름.변수이름
		System.out.println(StaticVariable.cv);
		
	}

}
