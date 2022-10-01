package OppMiniProject.ver01;

	import java.util.Scanner;

	public class ContactMain {

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in); // 이바름 정보 입력 후

			// Contact 인스턴스 생성 : 생성자를 이용한 데이터 초기화
			Contact c1 = new Contact("최예나", "010-0000-0000", "yena@na.com", "서울시", "19900529", "언홍원");

			System.out.println("이름 : " + c1.getName()); // private 때문에 Name 만 하면 안됨!
			System.out.println("전화번호 : " + c1.getPhoneNumber()); // 대문자로 클래스와 똑같이 넣기
			System.out.println("이메일 : " + c1.getEmail());
			System.out.println("주소 : " + c1.getAddress());
			System.out.println("생일 : " + c1.getBirthday());
			System.out.println("그룹 : " + c1.getGroup());

			System.out.println();
			c1.printInfo(); // 클래스 sysout 이 부분 그대로 출력되는

			// 인스턴스의 각 변수의 값을 바꾸는 메소드 이용해서 데이터 수정
			c1.setName("이바름");
			c1.setPhoneNumber("010-1234-1234");

			System.out.println();
			c1.printInfo();

			///////////////////////////////////////////////////////////

			while (true) { // * 구간반복
				System.out.println();
				System.out.println();
				System.out.println("1. 입력 시작 |  0.종료");
				String select = in.nextLine(); // 사용자가 입력한 것이니

				// 사용자 요청에 따라서 프로그램을 종료/진행 = > 분기처리
				if (select.equals("0")) {
					System.out.println("프로그램을 종료합니다");
					break;
				} else if (!select.equals("1")) { // 느낌표 빼먹지 말 것
					System.out.println("올바른 입력이 아닙니다!");
					continue;
				}

				System.out.println("데이터 입력을 시작합니다.");

				System.out.println("이름 > > > ");
				String name = in.nextLine();

				System.out.println("전화번호 > > > ");
				String phoneNumber = in.nextLine();

				System.out.println("이메일 > > > ");
				String email = in.nextLine();

				System.out.println(" 주소 > > > ");
				String address = in.nextLine();

				System.out.println("생일 > > > ");
				String birthday = in.nextLine();

				System.out.println("그룹 > > > ");
				String group = in.nextLine();

				// 인스턴스 생성
				Contact c = new Contact(name, phoneNumber, email, address, birthday, group);

				// 출력
				c.printInfo();

			}
		}
	


	}


