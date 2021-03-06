package site.metacoding.study.ex00;

// Object = 실체화(인스턴스화 = new)가 가능한 존재여야 한다.
// 임꺽정, 장보고

abstract class 요리사 {
	abstract public void 요리하다(); // 오버라이드 됨 (부모의 메서드를 무효화 시키는 것)
}

// 요리사
class 임꺽정 extends 요리사 {
	
	@Override
	public void 요리하다() { // 재정의가 됨.
		System.out.println("요리를 시작합니다. 카레가 완성되었습니다.");
	}
}

// 사장
class 장보고 {
	요리사 p1;
	
	public 장보고(요리사 p1) {
		this.p1 = p1;
	}
	
	public void 계산하기() {
		System.out.println("계산을 합니다.");
	}
}

// mock
class Mock임꺽정 extends 요리사 {

	@Override
	public void 요리하다() {
		// stub (가짜 메서드의 행동 정의)
	}
}

public class MockTest {

	public static void main(String[] args) {
//		요리사 p = new 임꺽정();
//		장보고 s = new 장보고(p);
//		s.p1.요리하다();
		
		// 테스트 - mock를 넣어주면 장보고만 테스트 가능!
		장보고 s = new 장보고(new Mock임꺽정());
		s.계산하기();
	}
}
