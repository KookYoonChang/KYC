package com.kh.testgame.game.model.vo;

public class Orc extends Monster {
	
	public Orc(int hp, int exp, String monName) {
		super(hp, exp, monName);
	}
	
	@Override
	public void cry() {
		System.out.println("��ũ�� ���¢���ϴ�.");
	}
	
	public void Axe() {
		System.out.println("��ũ�� ������ ����Ĩ�ϴ�!");
	}
	
	public void hitOrc() {
		System.out.println("��ũ�� ���뽺���� �ϸ� hp�� 100��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 100);
		
		if(super.getHp() <= 0) {
			System.out.println("��ũ�� �������ϴ�. ����ġ��" + super.getExp() + "����մϴ�." );
		}
	}
	

}
