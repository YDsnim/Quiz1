package edu.mit.logic;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mylogic {

	public static int addUp(int num1,int num2) {
		//num1 부터 num2까지 모두 더한값 구하기
		System.out.println("addup 진입");
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			
			 sum += i;
		}
		
		System.out.println("addup 리턴");
		return sum  ;
	}
	
	public static int evenAddUp(int num1,int num2) {
		//num1 부터 num2까지의 숫자중 짝수만 더할것
		System.out.println("evenaddup 진입");
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			
			if(i%2 == 0){
				sum+=i;
				System.out.println(i);
			}
		
		}
		System.out.println("evenaddup 리턴");
		return sum;
		
	}
	
}
