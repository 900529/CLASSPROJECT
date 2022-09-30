package ver03;

public class CompanyContact extends Contact {

	/*
	 * CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다. - 회사이름, 부서이름, 직급 변수 추가 - 정보를
	 * 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력
	 */

	// 변수
	private String company;
	private String division;
	private String manager;

	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String division, String manager) {

		super(name, phoneNumber, email, address, birthday, group);

		this.company = company;
		this.division = division;
		this.manager = manager;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사 이름 : " + this.company);
		System.out.println("부서 이름 : " + this.division);
		System.out.println("직급 : " + this.manager);
	}

	public static void main(String[] args) {

		Contact contact = new CompanyContact("yena", "010-2323-8989", "yena@naver.com", "Seoul", "1990-05-29", "직장동료",
				"구글", "선수", "부장");

		contact.printInfo();

	}

}
