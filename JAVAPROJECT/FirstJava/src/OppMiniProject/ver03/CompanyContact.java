package OppMiniProject.ver03;

public class CompanyContact extends Contact {

	// (1)CompanyContact
	// 회사, 거래처 정보를 저장하는 하위 클래스 정의
	// - 회사이름, 부서이름, 직급변수 추가
	// - 정보를 출력하는 메소드를 오버라이딩해서 추가된 정보를 추가해서 출력

	private String company;
	private String division;
	private String manager;

	// Generate Constructor using Fields 에서 Contact(String, String ~~ ) 선택
	// 상위클래스에서 정의해야되는 super 까지 정리

	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String division, String manager) {

		super(name, phoneNumber, email, address, birthday, group);

		this.company = company;
		this.division = division;
		this.manager = manager;
	}

	// Contact 클래스에서 printInfo 외 새롭게 추가된 정보까지 출력될 수 있도록!
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서이름 : " + this.division);
		System.out.println("직급 : " + this.manager);
	}

	public static void main(String[] args) {
		Contact contact = new CompanyContact("Yena", "010-7427-0529", "yena@naver.com", "Seoul", "1990-05-29", "직장동료",
				"구글", "개발", "없음");

		// 메소드 호출
		contact.printInfo();

	}
}
