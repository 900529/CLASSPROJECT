package chapter03;

public class CharTypeOperator {

	public static void main(String[] args) {

		char c1 = 'A';
		int codeNum = c1 + 0; // char+int → int + int = int
		System.out.println(codeNum);
		System.out.println(++c1); // 66 출력하고 c1 = 66
		System.out.println(c1++); // 66 먼저 가지고 있는거 출력하고 증가 c1 = 67
		System.out.println(++c1); // 증가부터 시키고 c1 = 68

	}

}
