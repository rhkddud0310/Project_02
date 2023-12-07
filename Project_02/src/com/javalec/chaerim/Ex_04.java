package com.javalec.chaerim;

import java.util.Scanner;

public class Ex_04 {

	// --------------------------------------------------------------//
			// Desc : 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
			// Date : 2023.12.07
			// Author : chaerim
	        // History : 1. 사용자에게 0~9를 이용해 정수를 입력받았다.
			// 2. num과 answer을 int로 정의하고, 값을 main에 보낸다.
			// 3. while문을 이용하여 answer을 출력한다.
			// 4. return을 사용한다.
			// --------------------------------------------------------------//
	
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
