package project.ver03;

public class CustomerContact extends Contact {

	// CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스 정의
	//   - 거래처회사이름, 거래품목, 직급변수 추가
	//   - 정보를 출력하는 메소드를 오버라이딩해서 추가된 정보를 추가해서 출력
	
	private String company;
	private String product;
	private String manager;
	
	// 생성자 
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String product, String manager) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.product = product;
		this.manager = manager;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처 이름 : " + this.company);
		System.out.println("거래 품목 : " + this.product);
		System.out.println("담당자 : " + this.manager);
	}

	

}
