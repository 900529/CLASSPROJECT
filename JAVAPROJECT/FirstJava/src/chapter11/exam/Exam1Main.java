package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam1Main {

	public static void main(String[] args) {
		// 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서
		// 인스턴스를 저장하고 출력하는 프로그램 만들기

		List<FootballPlayer> players = new ArrayList<>(); // new ArrayList 옆 <>풋볼플레이어 생략 가능

		// List<E> => 저장 메소드 add(new FootballPlayer())
		FootballPlayer player = new FootballPlayer("흥민", 8, "토트넘", 20);
		players.add(player);
		players.add(new FootballPlayer("바름", 17, "토트넘", 25));
		players.add(new FootballPlayer("강인", 13, "토트넘", 21));
		players.add(new FootballPlayer("지성", 9, "멘유", 24));
		players.add(new FootballPlayer("루니", 11, "멘유", 26));
		players.add(new FootballPlayer("흥민", 8, "토트넘", 20));

		// List<E> 특징 : 저장 순서를 유지 -> index 값을 가지고, 일괄처리
		System.out.println("나의 선수 리스트 =========");
		for (FootballPlayer p : players) { // player 대신 p로 써서 충돌 막기
			System.out.println(p);
		}

	}

}
