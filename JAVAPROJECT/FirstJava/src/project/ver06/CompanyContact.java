package project.ver06;

public class CompanyContact extends Contact {

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
		Contact contact = new CompanyContact("Son", "010-2323-5656", "son@gmail", "london", "2000-10-12", "직장동료", "토트넘",
				"선수", "없음");

		contact.printInfo();

	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub

	}

}