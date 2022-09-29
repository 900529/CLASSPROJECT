package chapter11;

public class GenericMethodByType {

	public <T> void hello(T t) {
		System.out.println("안녕하세요" + t.toString() + "입니다.");
	}

	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
		byType.<String>hello("최예나");
		byType.hello(10);  //String 뺀 이유? 
	}

}
