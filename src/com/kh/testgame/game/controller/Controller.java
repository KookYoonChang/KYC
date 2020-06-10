package com.kh.testgame.game.controller;

import com.kh.testgame.game.model.vo.Goblin;
import com.kh.testgame.game.model.vo.Monster;
import com.kh.testgame.game.model.vo.Orc;
import com.kh.testgame.game.model.vo.Player;

public class Controller {
	
	public Controller() {

	}

	public void StartPlay(String ID) {

		Player p = new Player(ID);

		System.out.println(p.getName() + "님께서 등장하셨습니다.");


		Monster g = new Goblin(500, 500, "고블린");
		g.cry();

		if(g instanceof Goblin) {
			((Goblin) g).hitGoblin();
		}

		for(int i = g.getHp(); i > 0; i -= 100) {
			if(g instanceof Goblin) {
				((Goblin) g).hitGoblin();
			}
		}

		p.setExp(p.getExp() + g.getExp());

		System.out.println(p);
	}
	public void StartPlay2(String ID) {
		Player p = new Player(ID);
		Monster o = new Orc(1000, 1000, "오크");
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
