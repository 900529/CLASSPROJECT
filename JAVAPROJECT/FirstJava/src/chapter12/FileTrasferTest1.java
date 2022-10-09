package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTrasferTest1 {

	public static void main(String[] args) {

		// 파일 복사 : 특정 파일의 데이터를 읽고, 다른 위치에 파일에 쓰는 것

		// 원본 파일
		InputStream in = null;
		// 복사본 파일
		OutputStream out = null;

		try {
			in = new FileInputStream("c:\\Test\\Testfile2.txt");
			out = new FileOutputStream("c:\\Test\\Testfile2copy.txt");

			while (true) {

				int data = in.read();

				if (data == -1) {
					break;
				}
				out.write(data); // 새로운 파일에 데이터 쓰기
			}

			System.out.println("복사 완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
		if(out != null) {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}

	}
}