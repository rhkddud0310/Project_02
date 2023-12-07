package com.javalec.sujin;

public class Ex_01 {
    // --------------------------------------------------------------//
	// Desc : 10의 10^0 ~ 10^10까지의 제곱승을 구해라.
	// Date : 2023.12.07
	// Author : ssujjy
	// History : 페이지 설명 추가.
	// --------------------------------------------------------------//
	
	// Property
	public String result="";
	
	// Constructor
	public Ex_01() {
		// TODO Auto-generated constructor stub
		this.result = exAction();
	}
	
	// Method
	private String exAction() {
		long k = 1;
		String gab = "";
		
		for(int i=0; i<=10; i++) {
			gab += "10^" + String.format("%2d",i) + " = " + String.format("%11d", k) + "\n";
			k*=10;
		}
		return gab;
	}
}
