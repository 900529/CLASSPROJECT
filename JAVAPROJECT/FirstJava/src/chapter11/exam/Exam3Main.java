package chapter11.exam;

import java.util.TreeSet;

public class Exam3Main {

	// 3. TreeSet<E>을 이용해서
	// 팀 이름순으로 정렬하고,
	// 같은 팀의 선수들은 이름 순으로 정렬하고,
	// 같은 이름의 선수는 번호 순으로 저장하는 프로

	public static void main(String[] args) {

		TreeSet<FootballPlayer> players = new TreeSet<>();

		FootballPlayer player = new FootballPlayer("흥민", 8, "토트넘", 20);
		players.add(player);
		players.add(new FootballPlayer("바름", 17, "토트넘", 25));
		players.add(new FootballPlayer("강인", 13, "토트넘", 21));
		players.add(new FootballPlayer("지성", 9, "멘유", 24));
		players.add(new FootballPlayer("루니", 11, "멘유", 26));
		players.add(new FootballPlayer("흥민", 8, "토트넘", 20));

		System.out.println("보유 선수의 수 : " + players.size());

		System.out.println("보유 선수 리스트 ==========");
		for (FootballPlayer p : players) {
			System.out.println(p);
		}

	}

}
