package chapter02;

public class ValiableRealNumber {

	public static void main(String[] args) {

		// 실수 타입 : double, float
		// 8byte 4byte
		// int 4byte, long 8byte

		// double 타입
		double num1 = 0.3; // num=1 double 타입의 데이터
		double num3 = 1.123456789102345;

		System.out.println(num1);
		System.out.println(num3);

		// float 타입
		float num2 = 0.3f; // num2=double타입의 데이터 f붙여줘야함.
		float num4 = 1.123456789102345f;

		System.out.println(num2);
		System.out.println(num4);

		double num5 = 1.1;
		double num6 = 1.3;

		double result = num5 + num6;
		System.out.println(result);

		int num7 = 0;

		System.out.println(num7);

	}
}
