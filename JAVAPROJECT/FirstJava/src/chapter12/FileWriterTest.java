package chapter12;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {
	

		String str = "Yena\n";
		char ch = 'A';
		char[] charArr = {'B', 'C', 'D'};
		
		Writer witer = null;
		
		try{
			writer = new FileWriter("c:\\Test\\text1.txt");
			wirter.write(str);
			wirter.write(ch);
			wirter.write(charArr);
			System.out.println("파일에 텍스트 문자열");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if(wirter != null) {
				try { 
					writer.close();
					
				}
				
			}
		}
		
	
		
		
	}

}
