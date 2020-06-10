package com.kh.testgame.game.view;

import java.util.Scanner;

import com.kh.testgame.game.controller.Controller;
import com.kh.testgame.game.model.vo.Goblin;
import com.kh.testgame.game.model.vo.Monster;
import com.kh.testgame.game.model.vo.Orc;
import com.kh.testgame.game.model.vo.Player;

public class Menu {

	private static String ID = null;

	
	public Menu(String ID) {
		this.ID = ID;
	}

	public void Menu() {
		Scanner sc = new Scanner(System.in);
		Controller co = new Controller();
		do {
			System.out.println("사냥할 몬스터를 선택");
			System.out.println("1.고블린");
			System.out.println("2.오크");
			System.out.println("3.종료");
			int no = sc.nextInt();
			
			
			switch(no) {
			case 1 : co.StartPlay(ID); break;
			case 2 : co.StartPlay2(ID); break;
			case 3 : System.out.println("종료합니다"); return;
			}

		}while(true);
	}





	private void StartPlay(String ID) {}

}
