package OppMiniProject.ver07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone {

	// 저장을 원래 배열에 했는데, List로~
	// private Contact[] contacts;
	// private int numOfContact;

	List<Contact> contacts; // 변수의 이름 똑같이
	Scanner sc;

	// 생성자에서는 초기화 작업했었는데,
	private SmartPhone() { // 사이즈 왜 없애는건지 확인!
		// contacts = new Contact[size];
		// numOfContact = 0;
		contacts = new ArrayList<>(); // <> 안에 Contact 생략 가능 // 디폴트는 10?
		sc = new Scanner(System.in);
	}

	private static SmartPhone sp = new SmartPhone();

	public static SmartPhone getInstance() {
		if (sp == null) {
			sp = new SmartPhone();
		}
		return sp;
	}

	private int getIndex() {

		String name = sc.nextLine();

		// 이름 검색 하는 index 찾아야한다
		int searchIndex = -1; // 찾지 못하면 -1

		// 데이터 찾기
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;

	}

	// 이름 검색후 데이터 수정
	void editContact() {

		// 검색어 받기
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.println("수정하고자 하는 이름을 입력하시오");

		int searchIndex = getIndex(); // *** 메소드호출로 초기화

		if (searchIndex < 0) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;

		}

		Contact contact = contacts.get(searchIndex); // *** get 추가

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값 : " + contact.getName() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newName = sc.nextLine();

		if (newName != null && newName.trim().length() > 0) {
			contact.setName(newName);
		}

		System.out.println("변경하고자 하는 전화번호를 입력해주세요.(현재값 : " + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newPhoneNumber = sc.nextLine();
		if (newPhoneNumber != null && newPhoneNumber.trim().length() > 0) {
			contact.setPhoneNumber(newPhoneNumber);
		}

		System.out.println("변경하고자 하는 이메일을 입력해주세요.(현재값 : " + contact.getEmail() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newEmail = sc.nextLine();
		if (newEmail != null && newEmail.trim().length() > 0) {
			contact.setEmail(newEmail);
		}

		System.out.println("변경하고자 하는 주소를 입력해주세요.(현재값 : " + contact.getAddress() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newAddress = sc.nextLine();
		if (newAddress != null && newAddress.trim().length() > 0) {
			contact.setAddress(newAddress);
		}

		System.out.println("변경하고자 하는 생일을 입력해주세요.(현재값 : " + contact.getBirthday() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newBirthday = sc.nextLine();
		if (newBirthday != null && newBirthday.trim().length() > 0) {
			contact.setBirthday(newBirthday);
		}

		System.out.println("변경하고자 하는 그룹을 입력해주세요.(현재값 : " + contact.getGroup() + ")\n" + "변경하지 않으려면 엔터 치세요 > ");
		String newGroup = sc.nextLine();
		if (newGroup != null && newGroup.trim().length() > 0) {
			contact.setGroup(newGroup);
		}

		if (contact instanceof CompanyContact) {
			CompanyContact companyContact = (CompanyContact) contact;
			System.out.println(
					"변경하고자 하는 회사이름을 입력해주세요.(현재값 : " + companyContact.getCompany() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String company = sc.nextLine();
			if (company != null && company.trim().length() > 0) {
				companyContact.setCompany(company);
			}

			System.out.println(
					"변경하고자 하는 부서이름을 입력해주세요.(현재값 : " + companyContact.getDivision() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String division = sc.nextLine();
			if (division != null && division.trim().length() > 0) {
				companyContact.setDivision(division);
			}

			System.out.println(
					"변경하고자 하는 직급을 입력해주세요.(현재값 : " + companyContact.getManager() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String manager = sc.nextLine();
			if (manager != null && manager.trim().length() > 0) {
				companyContact.setManager(manager);
			}

		} else if (contact instanceof CustomerContact) {

			CustomerContact customerContact = (CustomerContact) contact;

			System.out.println(
					"변경하고자하는 거래처 이름을 입력해주세요.(현재값: " + customerContact.getCompany() + ")\n" + "변경하지않으려면 엔터를치세요 >");
			String company = sc.nextLine();
			if (company != null && company.trim().length() > 0) {
				customerContact.setCompany(company);
			}

			System.out.println(
					"변경하고자하는 거래품목을 입력해주세요.(현재값: " + customerContact.getProduct() + ")\n" + "변경하지않으려면 엔터를치세요 >");
			String product = sc.nextLine();
			if (product != null && product.trim().length() > 0) {
				customerContact.setProduct(product);
			}

			System.out.println(
					"변경하고자하는 담당자 이름을 입력해주세요.(현재값: " + customerContact.getManager() + ")\n" + "변경하지않으려면 엔터를치세요 >");
			String manager = sc.nextLine();
			if (manager != null && manager.trim().length() > 0) {
				customerContact.setManager(manager);

			}
		}

		System.out.println("정보가 수정되었습니다.");
		System.out.println();

	}

	// 삭제 (이름으로 검색),
	void deleteContact() {

		// 검색어 받기
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하고자 하는 이름을 입력하시오");

		int searchIndex = getIndex();

// 검색한 index 값으로 분기 : 시프트를 하거나 검색 결과 이름이 존재하지 않는다. 
		if (searchIndex < 0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지 않습니다. ");
		} else {

			contacts.remove(searchIndex);

			System.out.println("데이터가 삭제되었습니다.");
		}

	}

	// 검색 후 결과 출력 (이름으로 검색)
	void searchInfoPrint() {

		String name = null; // 검색할 이름

		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 이름을 입력하세요. >");

		int searchIndex = getIndex();

		// 3. 결과출력 : "검색한 이름의 정보가 없습니다"
		System.out.println("검색의 결과==============");
		if (searchIndex < 0) {
			System.out.println("검색한 이름" + name + "정보가 없습니다.");
		} else {
			contacts.get(searchIndex).printInfo();
		}
	}

	// 전체 입력 데이터의 출력
	void printAllData() {

		System.out.println("전체 데이터를 출력합니다.==========");

		if (contacts.isEmpty()) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printInfo();
		}
	}

	// 친구 정보 입력
	void insertContact() {

		if (contacts.size() == 10) {
			System.out.println("최대 저장 개수는  10개 입니다.");
			return;
		}

		System.out.println("입력하고자 하는 친구 타입을 선택해주세요.");
		System.out.println("1. 회사 동료 \t 2. 거래처");
		int select = Integer.parseInt(sc.nextLine());

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		// 1. 데이터 받고
		System.out.println("입력을 시작합니다.");

		System.out.print("이름 > ");
		name = getName();

		System.out.print("번호 > ");
		phoneNumber = getString();

		System.out.print("이메일 > ");
		email = getString();

		System.out.print("주소 > ");
		address = getString();

		System.out.print("생일 > ");
		birthday = getString();

		System.out.print("그룹 > ");
		group = getString();

		Contact contact = null;

		// *** (추가) 여기서 분기가 되어야함! 1. 회사 2. 거래처 3. 직급
		if (select == 1) {
			// CompanyContact 인스턴스 생성
			System.out.println("회사이름 >> ");
			String company = getString();
			System.out.println("부서이름 >> ");
			String division = getString();
			System.out.println("직급 >> ");
			String manager = getString();

			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division,
					manager);

		} else {

			System.out.println("거래처 이름 >> ");
			String company = getString();
			System.out.println("거래 품목 >> ");
			String product = getString();
			System.out.println("담당자 >> ");
			String manager = getString();

			// 2. 인스턴스 생성
			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, company, product,
					manager);

		}

		contacts.add(contact);

	}

	// *** Scanner를 통해서 사용자에게 문자열을 받아서 반환하는 메소드
	// 입력 문자가 공백일 경우 다시 입력하도록 하는 기능
	private String getString() {

		String str = null;

		while (true) {
			str = sc.nextLine();

			if (str != null & str.trim().length() != 0) {
				break;
			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
			}

		}

		return str;

	}

	// 이름 정보 받아서 중복 여부 체크 후 문자열 반환
	private String getName() {
		String name = null;

		while (true) {
			name = sc.nextLine();

			if (name != null & name.trim().length() != 0) {
				// 배열의 요소에 같은 이름의 요소가 있는지 체크
				boolean check = false;

				// 이름 검색
				for (int i = 0; i < contacts.size(); i++) {
					if (name.equals(contacts.get(i).getName())) {
						check = true;
						break;
					}
				}

				if (check) {
					System.out.println("같은 이름의 데이터가 존재합니다 \n 다시 입력하세요! >> .");
					// continue;
				} else {
					break;
				}

			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
			}

		}
		return name;

	}

	// 전화번호를 받아서 중복된 전화번호가 있는지 체크, 중복되지 않는 전화번호 받아서 반환
	private String getPhoneNumber() {
		String phoneNumber = null;

		while (true) {

			phoneNumber = sc.nextLine();

			if (phoneNumber != null && phoneNumber.trim().length() > 0) {

				boolean check = false;

				// 중복 여부 체크
				for (int i = 0; i < contacts.size(); i++) {
					if (phoneNumber.equals(contacts.get(i).getPhoneNumber())) {
						check = true;
						break;
					}

				}

				if (check) {
					System.out.println("중복된 전화번호가 존재합니다 \n다시 입력해주세요. >> ");
				} else {
					break;
				}

			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
			}
		}
		return phoneNumber;

	}

}
