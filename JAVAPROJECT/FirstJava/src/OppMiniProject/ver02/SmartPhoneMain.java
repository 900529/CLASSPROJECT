package OppMiniProject.ver02;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone smartPhone = SmartPhone.getInstance();  // 싱글톤 

		// 입력 
		smartPhone.inserContact();

		// 전체 출력
		smartPhone.printAllData();
		
		
		
	}
}