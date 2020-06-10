package com.kh.testgame.game.model.vo;

public class Orc extends Monster {
	
	public Orc(int hp, int exp, String monName) {
		super(hp, exp, monName);
	}
	
	@Override
	public void cry() {
		System.out.println("오크가 울부짖습니다.");
	}
	
	public void Axe() {
		System.out.println("오크가 도끼를 내려칩니다!");
	}
	
	public void hitOrc() {
		System.out.println("오크가 고통스러워 하며 hp가 100만큼 감소합니다.");
		super.setHp(super.getHp() - 100);
		
		if(super.getHp() <= 0) {
			System.out.println("오크가 쓰러집니다. 경험치가" + super.getExp() + "상승합니다." );
		}
	}
	

}
