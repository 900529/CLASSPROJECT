package chapter09;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		// Ctrl + Shift + o => java.util.Date
		Date now = new Date();

		System.out.println("현재 시간 : " + now); // 현재 시간 : Wed Sep 28 10:04:29 KST 2022

		// System.out.println(now.getTime()); // 1664327144559

		// long 타입의 데이터로 Date 인스턴스 생성

		Date day = new Date(1664327144559L);
		System.out.println("day : " + day); // day : Wed Sep 28 10:05:44 KST 2022

		System.out.println(now.toString());
		System.out.println(day.toString());

	}

}
