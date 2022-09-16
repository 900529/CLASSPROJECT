package chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~10 까지의 합 => 55
		// 반복 10번, 변수가 1~10
		
		int num = 1;
		
		int sum = 0;  // 합을 구해야되니 0부터 시작 
		
		while (num<=10) {
			
			// 합을 구하는 연산 
			sum = sum + num; // (((0+1)+2)+3)...+10)
		   //System.out.println(sum+ "+" + num + "=" + (sum += num) );
			
			//증가식
			num ++;	
		}
		System.out.println("1~10까지의 합 : " + sum);
	}

}
