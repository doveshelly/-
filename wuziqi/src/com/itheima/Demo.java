package com.itheima;

public class Demo {
	public static void main(String[] args) {
		GoBang2 boardgame = new GoBang2();
		boardgame.initBoard();
		boardgame.printBoard();
		while (true) {
			boardgame.playgame();
		}
	}
}
