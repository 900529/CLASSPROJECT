package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		FileInputStream in = null;

		try {
			in = new FileInputStream("c:\\Test\\Testfile2.txt");

			// 무한반복, 탈출조건만 주면됨!
			while (true) {
				int data = in.read();
				if (data == -1) {
					break;
				}
				System.out.print((char) data);
			}
			
			System.out.println();
			
			System.out.println("데이터 읽기 성공!");
			
			
			int data = in.read();
			System.out.println(data);
			System.out.println((char) data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

	}
}
