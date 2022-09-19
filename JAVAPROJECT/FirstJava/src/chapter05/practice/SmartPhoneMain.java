package chapter05.practice;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		//참조변수 선언 : 인스턴스 메모리 주소값을 저장 
		SmartPhone sp = null;
		
		// 인스턴스 생성 : class에서 정의한 변수와 메소드를 사용할 수 있는 상태로 만드는 것
		// 인스턴화 : 변수와 메소드를 메모리에 로드한다. 
		sp = new SmartPhone (); // 인스턴 메모리를 생성하고 주소값 반환 
		
		// 인스턴스 변수 참조 방법
		System.out.println("스마트폰 제조사 : " + sp.company); 
		System.out.println("스마트폰 색상 : " + sp.color);
		System.out.println("스마트폰 크기 : " + sp.size);
		System.out.println("스마트폰 볼륨 크기" + sp.volumeSize );

		// 인스턴스 변수 할당
		sp.company = "Samsung";
		sp.color = "white";
		sp.size = 4.7f; //f : 4.7은 더블이니 따로 float 표시해야함
		sp.volumeSize = 10;
		
		// 인스턴스 변수 할당 후 
		System.out.println();
		System.out.println("인스턴스의 변수의 값 할당 후 =====");
		System.out.println("스마트폰 제조사 : " + sp.company); 
		System.out.println("스마트폰 색상 : " + sp.color);
		System.out.println("스마트폰 크기 : " + sp.size);
		System.out.println("스마트폰 볼륨 크기" + sp.volumeSize );
		
		// 인스턴스 메소드 호출 : 참조변수.메소드이름();
		
		
		sp.showInfo();
		
		//sp=null; //sp 하기 전에는 0x100 참조중, null 하게되면 가상머신이 더 참조하는 것이 없다
		// 삭제 대상으로 올려놓고 특정 시점이 되었을때 소멸해버린다. 
		// 결과적으로 필요한 것을 메모리에 올려놓고, 코딩 후 null 소멸하게 된다. 
		// 코딩하다보면 참조변수 = 할당하지 않게 된다. 소멸대상~ 
		
		System.out.println();
		sp.volumeUp();
		System.out.println("현재 불륨 : " + sp.volumeSize);
		
		sp.volumeDown();
		sp.volumeDown();
		System.out.println("현재 블룸 :" +sp.volumeSize);
		

		
		
	}

}
