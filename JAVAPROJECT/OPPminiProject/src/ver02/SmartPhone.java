package ver02;

import java.util.Scanner;

public class SmartPhone {

	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성될 필요 없다. => 싱글톤 패턴
	// 1.private 생성자
	// 2. 클래스 내부에서 인스턴스를 생성 static private // 여기서 변수선언하면 안되니까 static 넣었음 ? 이해되었음?
	// 3. 내부에서 생성한 참조값을 반환해주는 메소드 static public (누구나 쓸 수 있게)

	// 요구 사항
	// 이 클래스는 연락처 정보를 관리하는 클래스
	// (1) contact 클래스의 인스턴스 10개를 저장할 수 있는 배열 정의
	// => 10개 정보를 저장할 수 있다 => 배열 인스턴스를 생성 Contact[ ]
	// Contact 클래스 기반의 인스턴스를 최대 10까지 만들어서 배열에 참조값을 저장

	private Contact[] contacts;
	private int numOfContact; // 역할은 저장공간 10개가 있지만, 입력된 정보의 개수를 받는다. 0부터 시작~ , 배열의 index 값으로 사용
	Scanner sc; // 이후 추가 // 어느위치에서 어떤 범위인지~

	private SmartPhone(int size) {
		contacts = new Contact[size];
		numOfContact = 0; // 명시적으로 0으로 초기화
		sc = new Scanner(System.in); // 이후 추가
	}

	private static SmartPhone sp = new SmartPhone(10);

	public static SmartPhone getInstance() {
		if (sp == null)
			sp = new SmartPhone(10);

		return sp;
	}

	// (2) 기능
	// 배열에 인스턴스를 저장하고,
	// 수정하고 (이름으로 검색)
	// 삭제
	// 검색 후 결과 출력,
	// 저장된 데이터의 리스트를 출력하는 메소드 정의

	// 검색 후 결과 출력 (이름으로 검색)
	void searchInfoPrint() {

		// 1. 사용자에게 검색할 키워드 입력받는다!
		// 2. 배열에서 이름 검색
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다"

		String name = null; // 검색할 이름

		System.out.println("검색을 시작합니다");
		System.out.println("검색할 이름을 입력하세요 > ");
		name = sc.nextLine();

		Contact contact = null; // 출력하려면 찾고자 하는 곳은 콘텍트에

		// 배열에서 검색할 이름을 가지는 인스턴스의 데이터 출력 메소드를 실행
		for (int i = 0; i < numOfContact; i++) {
			// 각 요소의 참조변수를 객체로 참조해서 이름을 비교
			if (contacts[i].getName().equals("name")) { // 문자열 비교할때 equals
				contact = contacts[i];
				break;
			}
		}

		// 3. 결과출력 : "검색한 이름의 정보가 없습니다"
		System.out.println("검색의 결과=====================");
		if (contact == null) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다.");
		} else {
			contact.printInfo();
		}

		Scanner sc = new Scanner(System.in);

	}

	// 전체 입력 데이터의 출력
	void printAllData() { // 퍼블릭 안쓰는 이유는 이 안에 패키지 안에서만 하려구
		// 배열에 저장된 데이터를 모두 출력
		for (int i = 0; i < numOfContact; i++) { // contacts.length;에서 numOfContact 로 수정한 이유는? 추가한 개수만큼만
			contacts[i].printInfo();
		}
	}

	void insertContact() {
		// 배열에 인스턴스를 저장하고,
		// 1. 데이터를 받고 2. 인스턴스 생성 3. 배열에 인스턴스의 참조값을 저장

		// Scanner sc = new Scanner(System.in); //이걸 지우고 위에 내용 올림

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		// 1. 데이터 받는 코드
		System.out.println("입력을 시작합니다.:");

		System.out.print("이름 > ");
		name = sc.nextLine();

		System.out.print("전화번호  > ");
		phoneNumber = sc.nextLine();

		System.out.print("이메일  > ");
		email = sc.nextLine();

		System.out.print("주소  > ");
		address = sc.nextLine();

		System.out.println("생일  > "); // 왜 ln 뺀거지?
		birthday = sc.nextLine();

		System.out.print("그룹  > ");
		group = sc.nextLine();

		// 2. 인스턴스 생성 (선생님 뭘로 하셨지?)

		Contact contact = new Contact(name, phoneNumber, email, address, birthday, group);

		// 배열에 저장
		// 처음 입력 : numOfContact => 0
		contacts[numOfContact++] = contact;

	}

}
