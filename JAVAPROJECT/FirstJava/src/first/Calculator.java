package first;

public class Calculator {
//들여쓰기 가독성때문에 해야함. 
	public static void main(String[]args) {
		System.out.println("10+20="+add(10,20)); // 10+20=30  1번실행 함수로 아래로 갔다가 결과 나오고, 프린트
		System.out.println("100-10="+substract(100,10));//100-10=90 함수 아래 내려갔다가 전달하고, 리턴되서 프린트로, 옆 더하기와 프린트
		System.out.println("100*100="+multifly(100,100));//100*100=10000
		System.out.println("10/3="+divided(10,3)); 
	}
		
		//① 숫자 두 개(정수)를 매개변수의 인자로 전달받아  더하기  메소드 추가 but 반환은 없다 // long, double은 정수가 아녀서? 공부 필요
		public static long add(long num1, long num2) {  //인티져로 했다고 틀린것은 아니다!
		   long result = num1 + num2;
		   return result;
		//return num1+num2;  ← 간단한 연산이면 한줄로 표현해도 괜찮음
	  }
		//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드 추가 
	  public static long substract (long num1, long num2 ) {
		  return num1-num2;
	  }
		//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드 추가
	  public static long multifly(long num1, long num2) {
		  return num1 * num2;
	  }
		//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드 추가
	  public static double divided(double num1, double num2) {
		  return num1/num2;
	  }
	}