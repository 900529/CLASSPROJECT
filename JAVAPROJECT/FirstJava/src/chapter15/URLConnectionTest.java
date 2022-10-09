package chapter15;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) {
		
		String urlStr = "http://www.google.com";
		
		try {
		URL url = new URL(urlStr);
		
		URLConnection connection = url.openConnection();
		
		InputStream in = connection.getInputStream();
		
				while(true) {
					int data = in.read();
							if(data == -1) {
								break;
							}
					System.out.println((char)data);
				}
		
				
				
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		
	}

}
