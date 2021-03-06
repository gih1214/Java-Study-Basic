package site.metacoding.study.ex03.protoss;

public class Dragoon extends Protoss {
	// final이 있으면 디폴트 생성자를 만들 수 없다.
	public final String name; // 이름 -> 변경 불가능하게 final
	private static int power = 10; // 공격력 -> 질럿 생성 전에 공격,방어력 증가 가능하기 때문에 static
	private static int armor = 10; // 방어력
	private int hp; // 체력
	private int mp; // 마나

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public int getPower() {
		return power;
	}

	// 내 상태의 mp를 줄이는 책임, 상대방의 hp를 줄이는 책임
	public void 공격(Protoss unit) {
		// 나의 mp를 줄이기
		this.mp = this.mp - 20;

		// 상대방의 hp를 줄이기
		// 메시지 보내기 (메서드 호출) -> 책임을 분리 시킴
		unit.공격당함(power);
	}

	protected void 공격당함(int enemyPower) { // 수동
		hp = hp - enemyPower;
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
	public Dragoon(String name) {
		super(); // super는 제일 위에 있어야 한다.
		this.name = name;
		this.hp = 100; // 정해진 값이므로 초기화
		this.mp = 100;
	}

}
