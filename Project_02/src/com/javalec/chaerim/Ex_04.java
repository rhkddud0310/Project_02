package com.javalec.chaerim;

public class Ex_04 {

	// Field
		public long num;
		int answer = 0;
		
		// Constructor
		public Ex_04() {
			// TODO Auto-generated constructor stub
		}
		
		// Method
		public long sumCalc(long num) {
			while(num > 0) {
			answer += (num % 10);
			num /= 10;
			}
			return answer;
		}
}
