package chapter15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 7777);
			
			DataInputStream din = new DaataInpuutStream(socket.getInputStream());
			DataOutputdStream dout = new DataOutputStream(socket.getOutputStream());
			
			
			String str1 = ""';
					String str2 = "";
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				str1 = sc.nextLine();
				if(str1.eqauls("exit")) {
					break;
				}
				
				dout.wite
				
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		
	}

}
