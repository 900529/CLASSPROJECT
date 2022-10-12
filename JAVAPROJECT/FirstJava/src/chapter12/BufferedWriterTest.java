package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
	
		// BufferedWriter out = null;
		
		try(BufferedWriter out = new BufferedWriter (new FileWriter("c:\\Test\\test2"));) {
			// out = new BufferedWriter (new FileWriter("c:\\Test\\test2"));
			
			out.write("홍차(紅茶)는 차잎 내부의 성분이 자체에 들어있는 효소에 산화되어[3] 붉은 빛을 띠는 차를 뜻한다. ");
			out.newLine();
			out.write("그래서 홍차는 맛있다");
			out.newLine();
			out.write("커피보다 홍차를 더 많이 마셔야할까?");
			out.newLine();
			out.newLine();
			out.write("나무위키 참조");

			System.out.println("작성 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
