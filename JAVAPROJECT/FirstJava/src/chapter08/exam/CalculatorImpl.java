package chapter08.exam;

// 2. Calculator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의

public class CalculatorImpl implements Calculator {

	// 모든 추상메소드 구현, 필요한 시점에 다시 사용할 수 있음 
	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		/*
		 * 다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드 작성
		 */
		CalculatorImpl cal1 = new CalculatorImpl();
		Calculator cal2 = new CalculatorImpl();

		// 익명 클래스
		Calculator cal3 = new Calculator() {

			// 이제 인스턴스 생성할 수 있는 상태 but 이 시점에만 사용되고 더이상 사용되지 않는다. 
			@Override
			public long substract(long n1, long n2) {
				return n1 + n2+1;
			}

			@Override
			public long multiply(long n1, long n2) {
				return n1 - n2;
			}

			@Override
			public double divide(double n1, double n2) {
				return n1 * n2;
			}

			@Override
			public long add(long n1, long n2) {
				return n1 / n2;
			}
		}; 

	}

}
