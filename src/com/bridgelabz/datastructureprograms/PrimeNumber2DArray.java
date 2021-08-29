package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class PrimeNumber2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row = sc.nextInt();
		System.out.println("Enter the no of columns");
		int col = sc.nextInt();
		
		int[][] array=new int [row][col];
		int r=0,c=0,count=0;
		int total=row*col;
		for (int i=2;count<total;i++) {
			int div=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					div++;
					
				}
			}
			if(div==2) {
				array[r][c++]=i;
				count++;
				if(c==col) {
					r++;
					c=0;
				}
			}
		}
		System.out.println("prime numbers : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
