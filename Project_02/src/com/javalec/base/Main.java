package com.javalec.base;

import java.util.Scanner;

import com.javalec.chaerim.Ex_04;
import com.javalec.daegeun.Ex_03;
import com.javalec.sujin.Ex_01;
import com.javalec.sumin.Ex_02;

public class Main {

	public static void main(String[] args) {
		/* -------------------------------------------------------------
		(1) Desc : 절차형으로 개발된 Quiz를 객체형으로 변환하는 프로그램 만들기.
		(2) Date
			1) 2023.12.06.
			2) 2023.12.07. (rev.1)
		(3) Author : Gwangyeong Kim
		(4) History
			1) 최초 작성
			2) 결과물 구분해주기 위한 구분선 추가
				1. System.out.println("------------\n");
			3) 결과물 출력 Process 변경
				1. System.out.println(ex_02.result); -> ex_02.factorial();
				2. System.out.println(ex_03.result); -> ex_03.multiple();
				3. System.out.println(ex_04.result); -> ex_04.sumCalc();
			4) 종료 문구 추가
				1. System.out.println("<<< 종료 버튼을 선택하셨습니다.\n프로그램이 종료되었습니다. >>>");
		------------------------------------------------------------- */
		
		/* ------------------ 예비 프로젝트 (2) ------------------
		 < 절차형으로 개발된 Quiz를 객체형으로 변환.
		 	*** 종료를 선택하기 전까지 계속 사용된다. *** >
		 
		 (결과)
		 1. Ex1
		 2. Ex2
		 3. Ex3
		 4. Ex4
		 5. 종료
		 
		 원하는 결과물을 선택하세요 >>> 1
		 */
		
		System.out.println("<<< 예비 프로젝트 (2) >>>");
		System.out.println("< 절차형으로 개발된 Quiz를 객체형으로 변환. >\n"
				+ "*** 단, 종료를 선택하기 전까지 계속 사용된다. ***" + "\n");
		
		// Property
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;	// 원하는 결과물 번호가 저장될 변수
		String result = "";	// 원하는 결과물 결과가 저장될 변수
		
		while(true) {
			System.out.println("1. Ex1\n2. Ex2\n3. Ex3\n4. Ex4\n5. 종료\n");
			System.out.print("원하는 결과물을 선택하세요 >>> ");
			inputNum = scan.nextInt();
			System.out.println();
			if(inputNum == 5) {
				System.out.println("<<< 종료 버튼을 선택하셨습니다.\n프로그램이 종료되었습니다. >>>");
				break;
			}else if(inputNum == 1) {
				Ex_01 ex_01 = new Ex_01();
				System.out.println(ex_01.result);	// Ex_01 결과 출력 -> 수진이 누나
			}else if(inputNum == 2) {
				Ex_02 ex_02 = new Ex_02();
				ex_02.factorial();	// Ex_02 결과 출력 -> 수민이
			}else if(inputNum == 3) {
				Ex_03 ex_03 = new Ex_03();
				ex_03.multiple();	// Ex_03 결과 출력 -> 대근이 형
			}else if(inputNum == 4) {
				Ex_04 ex_04 = new Ex_04();
				ex_04.sumCalc();	// Ex_04 결과 출력 -> 채림이
			}
			System.out.println("------------\n");
		}
		
		

	}

}
