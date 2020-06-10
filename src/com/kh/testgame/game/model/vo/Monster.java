package com.kh.testgame.game.model.vo;

public abstract class Monster {
	
	private int hp;
	private int exp;
	private String monName;
	
	public Monster() {}
	
	public Monster(int hp, int exp, String monName) {
		this.hp = hp;
		this.exp = exp;
		this.monName = monName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public String getMonName() {
		return monName;
	}
	
	public void setMonName() {
		this.monName = monName;
	}
	public void lossHp(int amount) {
		if(hp >= amount) {
			this.hp -= amount;
			System.out.println("hp�� " + amount + "��ŭ �����մϴ�.");
		} else {
			if(hp != 0) {
				System.out.println("hp�� " + hp + "��ŭ �����մϴ�.");
			}
			
			
			System.out.println("hp�� 0�� �Ǿ� �׾����ϴ�.");
		}
	}
	
	public void cry() {
		System.out.println("���¢���ϴ�!");
	}
		
	

}
