package chpater04.exam;

public class Exam05 {

	public static void main(String[] args) {
		// 문제 5.
		// n=1일때 "현재 인원은 1명"
		// n=2일때 "현재 인원은 2명"
		// n=3일때 "현재 인원은 3명"
	    // n>3일때 "현재 많은 사람이 있습니다. 
		// 위 내용이 출력되는 프로그램 작성. 각각 if 문과 swich 문 사용
		
		int n = 3;
		
		switch(n) {
		case 1 :
			System.out.println("현재 인원은 1명 입니다.");
		break;
		case 2 :
			System.out.println("현재 인원은 2명 입니다.");
		break;
		case 3 :
			System.out.println("현재 인원은 3명 입니다.");
		break;
		default : 
			System.out.println("현재 많은 사람이 있습니다.");
		}
		
		
		if (n==1) {
			System.out.println("현재 인원은 1명 입니다.");
		} else if (n==2)
			System.out.println("현재 인원은 2명 입니다.");
	    } else if (n=3)
		System.out.println("현재 인원은 3명 입니다.");
       } else {
	    System.out.println("현재 많은 사람이 있습니다.");
		
       if (n>3) {
    	   System.out.println ("현재 많은 사람이 있습니다.")		}
       else {
    	   if (n==1) {
    		   
    	   }

	}

}
