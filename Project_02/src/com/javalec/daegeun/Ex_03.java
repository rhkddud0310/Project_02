package com.javalec.daegeun;

import java.util.Scanner;

public class Ex_03 {
	// --------------------------------------------------------------//
	// Desc : 입력한 숫자로부터 4개를 증가하여 화면 가로로 구구단을 표시하기
	// Date : 2023.12.06(Ver1.0)
	//      : 2023.12.07(Ver2.0)
	// Author : Daegeun Lee
	// History : 1. 값을 받기 위하여 스캐너를 입력 그리고 public int num = 0;을 Field에 생성
	//         : 2. 구구단의 코드를 for문으로 작성하여준다.
	//         : 3. "dan=num"으로 받아서 "dan<=num+3;"까지 출력하면 값이 나온다.
	// --------------------------------------------------------------//
	
	// Field
	Scanner scan = new Scanner(System.in);
	public int num = 0;
	
	// Constructor
	public Ex_03() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void multiple() {
		System.out.print("Input your number : ");
		num = scan.nextInt();
		for(int i=1; i<=9; i++) {
			for(int dan=num; dan<=num+3; dan++) {
				System.out.print(dan + " X " + i + " = " + (String.format("%2d", (dan*i))) + "\t");
			}
			System.out.println();
		}
	}
	
}
