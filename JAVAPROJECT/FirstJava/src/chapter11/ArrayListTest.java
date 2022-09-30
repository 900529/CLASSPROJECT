package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// String 타입의 객체 저장을 위한 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();

		// 요소 저장
		list.add("이바름");
		list.add("최예나");
		list.add(new String("최진영"));

		// 요소 개수
		System.out.println("저장된 요소의 개수 : " + list.size());

		// 요소 참조
		System.out.println(list.get(0));

		// 일괄 참조
		printAll(list);

		// 특정위치에 요소 추가
		list.add(1, "안정환");

		printAll(list);

		// 요소 삭제
		list.remove(1);
		printAll(list);
		System.out.println(list.get(1));

	}

	static void printAll(List<String> list) {
		System.out.println("전체 리스트 출력 ==========");
		for (String name : list) {
			System.out.println(name);

		}
	}
}
