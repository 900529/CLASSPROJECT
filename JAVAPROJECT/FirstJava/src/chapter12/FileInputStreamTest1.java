package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		// 파일 읽기 : InputStream => FileINputStream
		FileInputStream in = null;

		try {
			in = new FileInputStream("c: \\Test\\Testfile1.txt");

			int data = 0;
			System.out.println(data);
			System.out.println((char) data);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}
}
