package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {

		String str = "Yena\n";
		char ch = '공';
		char[] charArr = { '부', '중' };

		Writer writer = null;

		try {
			writer = new FileWriter("c:\\Test\\Text1.txt");

			writer.write(str);
			writer.write(ch);
			writer.write(charArr);

			System.out.println("파일에 텍스트 문자열 쓰기 완료");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

}
