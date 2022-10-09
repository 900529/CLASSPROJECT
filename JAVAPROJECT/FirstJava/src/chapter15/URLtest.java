package chapter15;

import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {

	public static void main(String[] args) {

		String urlStr = "https://news.naver.com/main/read.nhn?mode=LS2D&mid=sec&sid1=105&sid2=228&oid=584&aid=0000008620";

		try {
			URL url = url = new URL(urlStr);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
