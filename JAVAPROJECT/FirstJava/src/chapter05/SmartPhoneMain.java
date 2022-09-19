package chapter05;

// 클래스 정의 -> 뉴 인스턴스 생성 -> 참조변수로 호출 (필요한 변수값 처리) 


// 프로그램 시작 포인트
public class SmartPhoneMain {

	public static void main(String[] args) {

		// 참조변수 선언 : 인스턴스의 메모리 주소값을 저장
		SmartPhone sp = null; // sp클릭해서 컨트롤

		// 인스턴스 생성 : class에서 정의한 변수와 메소드를 사용할 수 있는 상태로 만드는 것
		// 인스턴화 => 변수와 메소드를 메모리에 로그한다
		sp = new SmartPhone(); // 인스턴스 메모리를 생성하고, 주소값을 반환

		// 인스턴스 변수 참조 방법 : 참조변수, 인스턴스변수이름
		System.out.println("스마트폰 제조사 : " + sp.company);
		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 크기 : " + sp.size);
		System.out.println("스마트폰 볼륨크기 : " + sp.volumeSize);

		// 인스턴스 변수 할당
		sp.company = "Samsung"; 
		sp.color = "White"; 
        sp.size = 4.7f; // 사이즈는 float인데 4.7은 더블이니 f 붙여야함 		
	    sp.volumeSize = 10;
	    
	    // 인스턴스 변수 참조 방법 : 참조변수, 인스턴스변수이름
	    System.out.println();
	    System.out.println("인스턴스의 변수의 값 할당 후 ============== ");
		//System.out.println("스마트폰 제조사 : " + sp.company);
		//System.out.println("스마트폰의 색상 : " + sp.color);
		//System.out.println("스마트폰의 크기 : " + sp.size);
		//System.out.println("스마트폰 볼륨크기 : " + sp.volumeSize);
	    
	    // 인스턴스의 메소드 호출 : 참조변수, 메소드이름();
	    sp.showinfo();
	 
	    // 볼륨 조정 : 키우기
	   sp.VolumeUp(); 
	   System.out.println("현재 볼륨 : " + sp.volumeSize);
	    
	    
	    // sp=null;  => null 하게되면 가르키는 것이 없다. 더이상 참조하는 것이 없기 때문에 ?! 
	    // 또 필요하면 sp 1 뉴 스마트폰~ 
	    
	}

}
