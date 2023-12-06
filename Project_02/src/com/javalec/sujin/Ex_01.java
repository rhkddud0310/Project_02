package com.javalec.sujin;

public class Ex_01 {
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
