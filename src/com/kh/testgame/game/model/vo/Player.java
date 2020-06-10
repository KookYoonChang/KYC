package com.kh.testgame.game.model.vo;

public class Player {
	
	private String ID;
	private int exp = 0;
	
	public Player(String name) {
		this.ID = name;
	}

	public String getName() {
		return ID;
	}

	public void setName(String name) {
		this.ID = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return ID + "���� ���� ����ġ��" + exp + "�Դϴ�.";
	}

}
