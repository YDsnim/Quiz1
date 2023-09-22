package edu.mit.logic;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mylogic {

	public static int addUp(int num1,int num2) {
		//num1 부터 num2까지 모두 더한값 구하기
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			
			 sum =+ i;
		}
		
		return sum  ;
	}
	
	public static int evenAddUp(int num1,int num2) {
		//num1 부터 num2까지의 숫자중 짝수만 더할것
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			
			if(i/2==0){sum=+i;}
		
		}
		return sum;
		
	}
	
}
