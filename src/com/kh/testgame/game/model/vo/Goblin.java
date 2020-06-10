package com.kh.testgame.game.model.vo;

public class Goblin extends Monster {

	public Goblin(int hp, int exp, String monName) {
		super(hp, exp, monName);
	}

	@Override
	public void cry() {
		System.out.println("고블린이 울부짖습니다.");
	}

	public void swing() {
		System.out.println("고블린이 몽둥이를 휘두릅니다.");
	}

	public void hitGoblin() {
		System.out.println("고블린이 고통스러워 하며 hp가 100만큼 감소합니다.");
		super.setHp(super.getHp() - 100);

		if(super.getHp() <= 0) {
			System.out.println("고블린이 쓰러집니다. 경험치가" + super.getExp() + "만큼 상승합니다." );
		}
	}

}
