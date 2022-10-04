package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// String 타입의 객체 저장을 위한 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		// List<String> list1 = new ArrayList<String>();
		// List<String> list2 = new ArrayList();

		// 요소 저장
		list.add("이바름");
		list.add("최예나");
		list.add(new String("최진영"));

		// 요소 개수
		System.out.println("저장된 요소의 개수 : " + list.size());

		// 요소 참조
		System.out.println(list.get(0)); // => 이바름, 첫번째~

		// 일괄 참조
		printAll(list);
		
		// 특정위치에 요소 추가 (자주 사용되지는 않음)
		list.add(1, "안정환"); // 두번째로 들어감~ 
		printAll(list);
		
		// 요소 삭제
		list.remove(1);
		printAll(list);
		
	}

	static void printAll(List<String> list) {
		System.out.println("전체 리스트 출력 ==========");
		for (String name : list) {
			System.out.println(name);
		}
//		for (String name : list) {
//			System.out.println(name);
//		}

	}
}
