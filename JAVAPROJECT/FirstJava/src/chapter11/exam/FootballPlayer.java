package chapter11.exam;

import java.util.Objects;

public class FootballPlayer  {

	private String name;
	private int number;
	private String team;
	private int age;
	
	public FootballPlayer(String name, int number, String team, int age) { //초기화 생성자 

		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}
	
	public FootballPlayer() {
	// 기본생성자, 디폴트 생성자를 해야되는 이유 확인 => 기본생성자 다음에는 게터세터 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name, number, team);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return age == other.age && Objects.equals(name, other.name) && number == other.number
				&& Objects.equals(team, other.team);
	}

	@Override //투스트링~ 
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	// 현재 클래스의 기능 테스트 용도 
	public static void main(String[] args) {
		
	}
	
	
	
}
