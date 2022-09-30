package chapter11.exam;

public class Exam3Main {

	// 3. TreeSet<E>을 이용해서 
	// 팀 이름순으로 정렬하고, 
	// 같은 팀의 선수들은 이름 순으로 정렬하고, 
	// 같은 이름의 선수는 번호 순으로 저장하는 프로
	
	public static void main(String[] args) {
		
		TreeSet<FootballPlayer> players = new Treeset<>();
		
		 FootballPlayer player = new FootballPlayer("이바름", 8, "토트넘", 20);
		   players.add(player);
		   players.add(new FootballPlayer("바름", 17, "토트넘", 25));
		   players.add(new FootballPlayer("강인", 13, "토트넘", 21));
		   players.add(new FootballPlayer("지성", 9, "토트넘", 24));
		   players.add(new FootballPlayer("루니", 11, "토트넘", 26));
		
		
	}
	
}
