package chapter12;

public class FileTrasferTest2 {
	
	public static void main(String[] args) {
		
		// 파일 복사 
		// 특정 파일의 데이터를 읽어서 다른 위치에 파일에 쓰면 => 복사 
		
		// 원본파일 
		InputStream in = null;
		outputStream out = null;
		
		try {
			in = new FileInputStream("c\\Test\\Testfile1.txt");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
