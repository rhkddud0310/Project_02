package com.javalec.daegeun;

import java.util.Scanner;

public class Ex_03 {
	// Field
	Scanner scan = new Scanner(System.in);
	public int num = 0;
	
	// Constructor
	public Ex_03() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public int multiple() {
		System.out.print("Input your number : ");
		num = scan.nextInt();
		for(int i=1; i<=9; i++) {
			for(int dan=num; dan<=num+3; dan++) {
				System.out.print(dan + " X " + i + " = " + (String.format("%2d", (dan*i))) + "\t");
			}
			System.out.println();
		}
		return num;
	}
	
}
