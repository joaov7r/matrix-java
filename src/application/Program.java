package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int m = sc.nextInt();
		System.out.print("Number of columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n]; 
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		System.out.print("type a number of the matrix created: ");
		int z = sc.nextInt();
		
		System.out.println("");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] == z) {
					System.out.println("Position: " + i + "," + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					System.out.println("");
				}
			}	
		}
		sc.close();
	}
}

