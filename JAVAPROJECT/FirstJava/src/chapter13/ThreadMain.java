package chapter13;

public class ThreadMain {

	// 메인 스체드 실행 시점
	public static void main(String[] args) {

		// 새로운 일의 흐름을 생성 => 스래드 생성
		MyThread thread1 = new MyThread(); // new

		// 쓰래드의 실행 : 흐름이 생성되고, run() 실행
		thread1.start();

		// Runnable 객체를 이용한 스레드 생성 실행
		
		Mythread2 t = new Mythread2();
		
		Thread thread2 = new Thread(t);
		
		// 스레드 실행
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1. 스래드가 종료될 때까지 다른 스래드 블록 상태로 처리 

		
		
		System.out.println("프로그램 종료");
	}

}
