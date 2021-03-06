package site.metacoding.study.ex02;

class UtilTest {
	
	// 익셉션을 내가 제어하려면 메서드 내부 안에 예외처리
	public static void divide(int n) {
		try {
			System.out.println(10/n);
		} catch (Exception e) {
			System.out.println("0을 나눌 수 없어요. 다른 값을 넣으세요.");
		}
	}
	
	// 호출한 쪽에 제어권을 넘기려면 메서드 옆에 익셉션
	public static void divide2(int n) throws Exception {
		System.out.println(10/n);
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		UtilTest.divide(0);
		
		// 호출한 쪽에서 예외처리 해야 됨.
		try {
			UtilTest.divide2(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
