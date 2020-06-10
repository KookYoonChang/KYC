package com.kh.testgame.game.model.vo;

public class Goblin extends Monster {

	public Goblin(int hp, int exp, String monName) {
		super(hp, exp, monName);
	}

	@Override
	public void cry() {
		System.out.println("����� ���¢���ϴ�.");
	}

	public void swing() {
		System.out.println("����� �����̸� �ֵθ��ϴ�.");
	}

	public void hitGoblin() {
		System.out.println("����� ���뽺���� �ϸ� hp�� 100��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 100);

		if(super.getHp() <= 0) {
			System.out.println("����� �������ϴ�. ����ġ��" + super.getExp() + "��ŭ ����մϴ�." );
		}
	}

}
