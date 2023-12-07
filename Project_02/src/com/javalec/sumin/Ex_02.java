package com.javalec.sumin;

import java.util.Scanner;

public class Ex_02 {
	
//	Description: Write an algorithm to find the factorial of a given number. 	
//
//	Date: 2023.12.06 (V.1)
//	      2023.12.07 (V.2)
//    
//	Author: Sumin Kim (김수민) 
//	 
//	History: 1.) Created an instance of a Scanner class. 
//	 	 2.) Ask the user to enter the input number.
//	 	 3.) Declare a variable to store a number. 
//	         4.) Declare a new variable for the loop,store the factorial of a number. 
//	 	 5.) Update the factorial variable by multiplying it with the loop variable in each iteration. 
//	         6.) Print the factorial of the given number. 
	
	
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
