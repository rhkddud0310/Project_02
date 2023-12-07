package com.javalec.chaerim;

import java.util.Scanner;

public class Ex_04 {

	// Field
		Scanner scan = new Scanner(System.in);
		int num = 0;
		public int answer = 0;

		// Constructor
		public Ex_04() {
			// TODO Auto-generated constructor stub
		}

		// Method
		public long sumCalc() {
			System.out.print("Enter an integer(0 ~ 9) : ");
			num = scan.nextInt();
			while (num > 0) {
				answer += (num % 10);
				num /= 10;
			}
			System.out.println(answer);
			return answer;
		}
}
