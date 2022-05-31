package site.metacoding.study.ex03.protoss;

public class Zealot {
	// final이 있으면 디폴트 생성자를 만들 수 없다.
	private final String name; // 이름 -> 변경 불가능하게 final
	private static int power = 10; // 공격력 -> 질럿 생성 전에 공격,방어력 증가 가능하기 때문에 static
	private static int armor = 10; // 방어력
	private int hp; // 체력
	private int sh; // 쉴드(보호막)
	
	// 질럿은 공격을 할 수 있다.
	// 상대방의 상태를 변경시킴
	// 어택은 내 
	public void attack() {
		
	}
	
	// 공격력 증가
	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1 증가 하였습니다.");
	}
	
	// 방어력 증가
	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1 증가 하였습니다.");
	}

	// 생성자
	public Zealot(String name) {
		super(); // super는 제일 위에 있어야 한다.
		this.name = name;
		this.hp = 100; // 정해진 값이므로 초기화
		this.sh = 100; // 정해진 값이므로 초기화
	}
	
}