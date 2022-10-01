package chapter09;

public class MathTest {

	public static void main(String[] args) {

		
		// PI 상수 
		System.out.println(Math.PI);

		// 난수 생성
		System.out.println(Math.random());
		
		// 1~45까지의 난수 int로 형변환 
		int num = (int) (Math.random() * 45) + 1; // 0~44.999999 절삭하고 +1
		System.out.println(num);

		// 절사
		System.out.println(Math.floor(3.6002));

		// 반올림
		System.out.println(Math.round(3.4002));
	}

}
