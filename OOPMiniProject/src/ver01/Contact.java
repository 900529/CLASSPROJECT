package ver01;

public class Contact {

	/*
	 이름, 전화번호, 이메일, 주소, 생일, 그룹 
	 메인 메소드 정의 
	 연락처 데이터 저장하는 인스턴스 생성 
	 변수 값 반환하는 각각의 메소드 호출해서 데이터를 출력문으로 출력 
	 생성된 인스턴스 정보 출력 메소드를 호출
	 인스턴스의 각 변수 값을 바꾸는 메소드를 이용해서 데이터 수정
	 인스턴스 출력 메소드 다시 실행
	 */

	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;

	public Contact(String name, String phoneNumber, String email, String birthday, String group) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public Contact() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String string) {
		this.birthday = string;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}

	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);

	}

}
