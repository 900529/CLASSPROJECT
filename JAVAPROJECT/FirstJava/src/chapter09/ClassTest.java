package chapter09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class userClass = Class.forName("chapter09.User");

		// 변수, 메소드, 생성자 
		
		System.out.println("변수 리스트 ===============");
		Field[ ]  fieldList = userClass.getFields();
		
		System.out.println(fieldList.)
		
		for(Field f : fieldList) {
			System.out.println(f.getName());
		}
				
		System.out.println("생성자 리스트 ===============");
		for(Constructor<T> c : userClass.getConstructors()) {
			System.out.println("개수" + c.
					
				
					for(Class param : c.getParameterTypes()) {
							System.out.println(param.getName());
		}
		
	}

}
