package com.kh.testgame.game.controller;

import com.kh.testgame.game.model.vo.Monster;
import com.kh.testgame.game.model.vo.Orc;
import com.kh.testgame.game.model.vo.Player;

public class Controller2 {
	public Controller2(Player player) {

	}

	public void StartPlay(String ID) {

		Player p = new Player(ID);

		System.out.println(p.getName() + "�Բ��� �����ϼ̽��ϴ�.");


		Monster o = new Orc(1000, 1000, "��ũ");
		o.cry();

		if(o instanceof Orc) {
			((Orc) o).hitOrc();
		}

		for(int i = o.getHp(); i > 0; i -= 100) {
			if(o instanceof Orc) {
				((Orc) o).hitOrc();
			}
		}

		p.setExp(p.getExp() + o.getExp());

		System.out.println(p);

	}


}
