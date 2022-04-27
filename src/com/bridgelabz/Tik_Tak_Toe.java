package com.bridgelabz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tik_Tak_Toe {
	
	public static void main(String[] args) {
		
		char[][] gameboard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{' ','+',' ','+',' '},
				{' ','|',' ','|',' '}};
		
		printGameBoard(gameboard);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your Place (1-9):");
			int playerpos = sc.nextInt();
			
			placepiece(gameboard,playerpos,"player");
			
			Random rand = new Random();
			int CPUpos = rand.nextInt(9) +1;
			placepiece(gameboard,CPUpos,"CPU");
			
			printGameBoard(gameboard);
		}
	}
	
		private static void printgameboard(char[][] gameboard) {
		
			for(char[] row:gameboard) {
			for(char c: row) {
				System.out.println(c);
			}
			System.out.println();
		}

}

		private static void printGameBoard(char[][] gameboard) {
		
	}

		public static void placepiece(char[] [] gameboard, int pos, String user) {
			
			char symbol = ' ';
			if (user.equals("Player")) {
				symbol = 'X';
			} else if (user.equals("CPU")) {
				symbol = 'O';
			}
			switch(pos) {
			case 1:
				gameboard[0][0] = symbol;
				break;
			case 2:
				gameboard[0][2] = symbol;
				break;
			case 3:
				gameboard[0][4] = symbol;
				break;
			case 4:
				gameboard[2][0] = symbol;
				break;
			case 5:
				gameboard[2][4] = symbol;
				break;
			case 6:
				gameboard[2][6] = symbol;
				break;
			case 7:
				gameboard[4][0] = symbol;
				break;
			case 8:
				gameboard[4][2] = symbol;
				break;	
			case 9:
				gameboard[4][4] = symbol;
				break;	
			default:
				break;

		}
		
	}
}
	
		