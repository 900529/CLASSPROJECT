package chapter13;

// 스레드 클래스 정의 : thread 클래스 상속해서 run() 메소드를 오버라이딩 
public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("새로운 스레드가 생성되어 실행됩니다.");

			Thread.sleep(500); // 현재 스레드의 상태를 block 상태로 변경 
			
		}

	}

}
