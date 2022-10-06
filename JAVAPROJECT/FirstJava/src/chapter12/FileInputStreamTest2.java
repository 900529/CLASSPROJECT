package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		// 파일 읽기 : InputStream => FileINputStream
		FileInputStream in = null;

		try {
			in = new FileInputStream("c: \\Test\\Testfile2.txt");

			while(true) {
				int data = in.read();
				if(data==-1) {
					break;
				}
				System.out.println((char)data);
			}
			
			System.out.println();
			
			System.out.println("데이터 읽기 성공!");
			
			int data;
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
