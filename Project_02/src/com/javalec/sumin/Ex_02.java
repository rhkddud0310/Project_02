package com.javalec.sumin;

import java.util.Scanner;

public class Ex_02 {
	// property
	Scanner scan = new Scanner(System.in);
	public int num = 0;
	public int tot = 1;
	
	// Constructor
	public Ex_02() { 

	}

	// Method

	public int factorial() {
		System.out.print("Input your decimal no. : ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			tot *= i;
		}
		System.out.println(num + "'s factorial value = " + tot);
		return tot;
		

	}

}