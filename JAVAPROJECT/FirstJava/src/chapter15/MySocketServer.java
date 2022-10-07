package chapter15;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class MySocketServer {

	public static void main(String[] args) {

		try {

			ServerSocket ss = new ServerSocket(9999);
			System.out.println("소켓 서버가 생성되었습니다. ");
			// 통신을 위한 Socket 필요
			Socket s = ss.accept(); // 연결요청이 있을 때 Socket 객체가 생성

			DataInputStream din = new DataInputStream(s.getInputStream());

			String str = din.readUTF();

			System.out.println("Client : " + str);

			din.close();

			s.close();

			System.out.println("연결되었습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
