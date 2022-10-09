package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTrasferTest2 {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;

		int copyByte = 0; // 총 복사한 데이터 사이즈
		int byteDataSize = 0;
		byte[] bufData = new byte[1024 * 2];

		try {
			in = new FileInputStream("c:\\Test\\Test.pdf");
			out = new FileOutputStream("c:\\Test\\TestCopy1.pdf");

			System.out.println("복사가 시작되었습니다.");

			while (true) {

				byteDataSize = in.read(bufData); // 데이터 사이즈 반환

				if (byteDataSize == -1) {
					break;
				}
				out.write(bufData, 0, byteDataSize); // 새로운 파일에 데이터 쓰기
				copyByte += byteDataSize;
			}

			System.out.println("복사 완료");
			System.out.println("복사한 파일의 사이즈 : " + copyByte);

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
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}