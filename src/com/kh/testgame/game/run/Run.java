package com.kh.testgame.game.run;

import java.util.Scanner;

import com.kh.testgame.game.controller.Controller;
import com.kh.testgame.game.view.Menu;


public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("ID : ");
		String ID = sc.nextLine();
		
		new Menu(ID).Menu();
		
		
	}

}
