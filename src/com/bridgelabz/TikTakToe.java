package com.bridgelabz;

public class TikTakToe {
	
	public static void main(String[] args) {
		
		for (int i=0; i<=3; i++) {
			for (int j=0; j<3; j++) {
				
				System.out.println(grid[i][j] +" ");
			}
		}
		char[] [] grid = new char[3][3];
		
		grid[0] [0] = ' ';
		grid[0] [1] = ' ';
		grid[0] [2] = ' ';
		grid[1] [1] = ' ';
		grid[1] [2] = ' ';
		grid[1] [3] = ' ';
		grid[2] [1] = ' ';
		grid[2] [2] = ' ';
		grid[2] [3] = ' ';
		
		displayGrid(grid);
		
		System.out.println("The value is:"+grid[0][0]);
	}

	private static void displayGrid(char[][] grid) {
		
		
	}

}
