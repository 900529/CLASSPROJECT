package chpater04.exam;

public class Exam06 {

	public static void main(String[] args) {
		// 문제 6.
		// 1부터 99까지의 합을 구하는 프로그램 작성
		// while 문, for 문, do while 문을 각각 사용
		
		int num = 1;
		int sum = 0;
		
		while (num<100) {
			System.out.println("while 문을 이용한 1~00 까지의 합 :" + num);
			sum=0;
			sum += num;
			num++;
		}
		
		for (num=1; num<100; num++ ) {
			sum+=num;
		System.out.println( "for 문을 이용한 1~100까지의 합 :" + num);
		}
		
		num = 1;
	
		do {
			//System.out.println(num);
			num++;
		} while(num<100);
	}
	}

