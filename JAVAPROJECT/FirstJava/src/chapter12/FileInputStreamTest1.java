package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		// 파일 읽기 : InputStream => FileInputStream
		FileInputStream in = null;

		try {
			in = new FileInputStream("c:\\Test\\Testfile1.txt");

			
			int data = in.read();
			System.out.println(data);
			System.out.println((char)data);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 중간 오류를 방지하기 위해

			if (in != null) {
				try {
					in.close(); // 다만 여기도 예외 방지를 위해 try catch
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}
}
