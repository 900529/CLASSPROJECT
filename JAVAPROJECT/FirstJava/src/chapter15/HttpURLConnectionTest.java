package chapter15;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionTest {

	public static void main(String[] args) {
		
		String urlStr = "http://www.google.com";
		
		try {
		URL url = new URL(urlStr);
		
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		
		for(int i=1; i<=8; i++) {
			System.out.println(connection.getHeaderFieldKey(i)+ " = " + connection.getHeaderField(i));
		}
		
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
		
	}}}


