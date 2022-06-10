package site.metacoding.study.ex03.protoss;

import site.metacoding.study.ex03.StarAble;

public abstract class Protoss implements StarAble {
	protected abstract void 공격당함(int enemyPower); // 추상은 public, protected 가능
}
