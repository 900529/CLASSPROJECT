package chapter10.exam;

import java.util.regex.Pattern;

public class Exam1Main {

	public static void main(String[] args) {
		/*
		 콘솔에서 사용자 아이디를 입력 받아 
		 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들자 
		 ① 사용자 예외 클래스를 정의해서 예외를 발생 시키고, 
		 ② 예외 클래스 이름은 BadIdInputException이라고 정의하자
		 */

		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들자
		// 'a' <= c <= 'z' || 'A' <= c <= 'Z' || '0'<= c <= '9'

		String str = "010-7427-0529";
		boolean chk1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}", str);
		// ^ 패턴의 시작, $ 종료, [ ] 집합, a-z 범위 표시, * 있을수도, 없을수도 있다! 
		// ^[a-z0-9A-Z]*$ 영문자와 숫자의 조합으로 패턴
		System.out.println(chk1);
		
		try {
		if(!chk1) {
		 throw new Exception(); 
		}
		} catch(Exception e) {
			System.out.println("소문자, 대문자, 숫자 입력만 가능합니다.");
			
		}
		

		// 숫자만 : ^[0-9]*$
		// 영문자만 : ^[a-zA-Z]*$
		// 한글만 : ^[가-힣]*$
		// 영어+숫자 : ^[a-z0-9A-Z]*$
		// 이메일 :   ^[a-z0-9A-Z]+@+[a-zA-Z0-9]\.+[a-zA-Z]+$     .하나만은 처리가 안되서 \. 역슬래쉬 같이 넣어야함 
		// 전화번호 : ^\d{3}-\d{4}-\d{4} :  \d 숫자표시, 앞에 3 자리 
		// ?    :  앞에 문자가 하나거나 없거나
		//  |    :  or
		// .     :  하나의 문자
		// \w  :  알파펫 + 숫자 
		// \d  : [0-9] 숫자표시 
		// \\ 두개씩 자바에서는
		
		
		
	}

}
