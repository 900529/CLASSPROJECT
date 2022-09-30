package chapter11.exam;

import java.util.HashSet;

public class Exam2Main {

	public static void main(String[] args) {
		
		// 2. 축구선수의 인스턴스가 (팀/이름/나이) 같으면 같은 선수라 판단하고 
		// 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 
		// 축구선수 인스턴스를 저장하고 출력하는 프로그램 만들자 
		
		// Set<E>  : 중복 허용 X, 저장 순서 유지 X
		// 중복 검사 : hashCode 코드로 검사 => equals 통해 중복 검사
		
		// 언제 FootballPlayer 클래스에 hash code??
		
		Set<FootballPlayer> players = new HashSet<FootballPlayer>();
		
		  FootballPlayer player = new FootballPlayer("이바름", 8, "토트넘", 20);
		   players.add(player);
		   players.add(new FootballPlayer("바름", 17, "토트넘", 25));
		   players.add(new FootballPlayer("강인", 13, "토트넘", 21));
		   players.add(new FootballPlayer("지성", 9, "토트넘", 24));
		   players.add(new FootballPlayer("루니", 11, "토트넘", 26));
		   
		   System.out.println("보유 선수의 수 : " + players.size());

		   System.out.println("보유 선수 리스트 ======= ");
		   for(FootballPlayer p : players) {
			   System.out.println();
		   }
		   
	}

}
