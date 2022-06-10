package site.metacoding.study.ex03;

import site.metacoding.study.ex03.protoss.Dragoon;
import site.metacoding.study.ex03.protoss.Zealot;

public class App {

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Zealot z2 = new Zealot("질럿2");
		Dragoon d1 = new Dragoon("드라군1");

		// z1이 z2의 hp를 z1의 power만큼 마이너스한다.
		z2.공격당함(z1);

		// z1이 d1을 공격하고 싶다.
		// z1이 d1의 hp를 z1의 power만큼 마이너스한다.
		d1.공격당함(z1);

		// d1이 z2를 공격하고 싶다.
		z2.공격당함(d1);
	}

}
