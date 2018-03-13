package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class GoBang2 {
	private static int boardSize = 15;
	private String[][] board;
	public void initBoard(){
		board=new String[boardSize][boardSize];
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				board[i][j] = "��";
			}
		}
	}
	public void printBoard(){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public void playgame(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�밴����Ҫ����������:x,y");
			String xy=sc.nextLine();
			String[] split = xy.split(",");
			int i = Integer.parseInt(split[0]);
			int j=Integer.parseInt(split[1]);
			if (i>15 || i<0 ||j>15 || j<0) {
				System.out.println("����������곬����Χ,����������:");
				continue;
			}else {
				if (board[i][j].equals("��")) {
					board[i][j]="��";
					printBoard();
					if (uwin()) {
						return;
					}
					System.out.println();
					System.out.println("--------------");
					System.out.println();
					compaly();
					printBoard();
				}else {
					System.out.println("������ط���������,�������������");
				}
			}
		}
	}
	public void compaly(){
		Random r = new Random();
		while(true){
			int i = r.nextInt(15);
			int j = r.nextInt(15);
			if (board[i][j].equals("��")) {
				board[i][j]="o";
				break;
				}
		  }
		
	}
	public boolean uwin(){

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length-4; j++) {
				if (board[i][j].equals("��")&&board[i][j+1].equals("��")&&board[i][j+2].equals("��")&&board[i][j+3].equals("��")&&board[i][j+4].equals("��")) {
					System.out.println("��Ӯ��!");
					return true;
				}
			}
		}
		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length-4; i++) {
				if (board[i][j].equals("��")&&board[i+1][j].equals("��")&&board[i+2][j].equals("��")&&board[i+3][j].equals("��")&&board[i+4][j].equals("��")) {
					System.out.println("��Ӯ��!");
					return true;
				}
			}
		}
		for (int i = 0; i < board.length-4; i++) {
			for (int j = 0; j < board.length-4; j++) {
				if (win(i,j)) {
					System.out.println("��Ӯ��!");
					return true;
				}
			}
		}
		return false;
	}
	public boolean win(int i,int j){
		if (board[i][j].equals("��")&&board[i+1][j+1].equals("��")&&board[i+2][j+2].equals("��")&&board[i+3][j+3].equals("��")&&board[i+4][j+4].equals("��")) {
			return true;
		}
		if (board[i+4][j].equals("��")&&board[i+3][j+1].equals("��")&&board[i+2][j+2].equals("��")&&board[i+1][j+3].equals("��")&&board[i][j+4].equals("��")) {
			return true;
		}
		return false;
	}
		
}
