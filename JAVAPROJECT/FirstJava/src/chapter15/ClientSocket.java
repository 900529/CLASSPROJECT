package chapter15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("localhost", 9999);
			DataOutputStream sout = new DataOutputStream(s.getOutputStream());

			dout.writeUTF("안녕하세요. 최예나입니다.");
			dout.flush();

			dout.close();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
