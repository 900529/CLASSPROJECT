package chapter06.exam;

public class Student2 {

	private String name;
	private int korScore;
	private int engScore;
	private int matScore;

	public Student2(String name, int korScore, int engScore, int matScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMatScore() {
		return matScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	// 총점을 구해서 반환하는 메소드
	public int sum() {
		int result = 0;

		result = korScore + engScore + matScore;

		return result;
	}

	// 평균값 구해서 반환ㅅ하는 메소드

	public float avg() {

		return sum() / 3f; // 3만 넣으면 int 연산이 되기 때문에, f 넣어야함!

	}

	// 행 단위 출력
	public void printData() {

		System.out.print(this.name + "\t" + this.korScore + "\t" + this.engScore + "\t" + this.matScore + "\t" + sum()
				+ "\t" + avg() + "\n");

	}

	public static void main(String[] args) {

		Student2 s = new Student2("학생1", 100, 99, 89);
		System.out.println("합 : " + s.sum());
		System.out.println("평균 : " + s.avg());

		s.printData();

	}

}