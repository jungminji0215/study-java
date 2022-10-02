package basic.lamda;

public class LamdaTest {
	public static void main(String[] args) {

		/*
		LamdaInterface obj = new LamdaInterface() {
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		 */

		LamdaInterface lamda = (a, b) -> a > b ? a : b;

		int value = lamda.max(3,5); // 함수형 인터페이스
		System.out.println("람다 테스트: " + value);
	}
}


// 함수형 인터페이스 - 단 하나의 추상 메서드만 가져야함.
interface LamdaInterface {
	public abstract int max(int a, int b);
}