package site.metacoding.study.ex03.protoss;

// 다형성 = 질럿은 질럿이기도 하고 프로토스 이기도 하다. (2가지 이름으로 부를 수 있다.)
public class DarkTempler extends Protoss {
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
	public DarkTempler(String name) {
		super(); // super는 제일 위에 있어야 한다.
		this.name = name;
		this.hp = 100; // 정해진 값이므로 초기화
		this.mp = 100;
	}

	@Override
	public void 공격(Protoss unit) {
		this.mp = this.mp - 10;
		unit.공격당함(power);
	}

	@Override
	protected void 공격당함(int enemyPower) {
		hp = hp - enemyPower;
	}

}
