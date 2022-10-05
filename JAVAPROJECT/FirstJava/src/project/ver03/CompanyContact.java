package project.ver03;

public class CompanyContact extends Contact {

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
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}



	public static void main(String[] args) {
		Contact contact = new CompanyContact("Yena", "010-7427-0529", "yena@naver.com", "Seoul", "1990-05-29", "직장동료",
				"구글", "개발", "없음");

		// 메소드 호출
		contact.printInfo();

	}
}
