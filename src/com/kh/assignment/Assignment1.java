package com.kh.assignment;

import java.util.Scanner;


public class Assignment1 {
	/*최원준 문제
	 * 정렬된 정수 배열안에 입력받은 정수가 있는지 확인하세요
	 * 배열안 정수는 {1,5,8,9} 입니다.
	*/
	
	//
	// 사용자에게 금액을 입력받아 거스름돈을 주는 프로그램을 작성. 배열사용. 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] coinUnit = { 50000,10000,5000,1000,500, 100, 50, 10 };
		 System.out.println("금액 입력 : ");
		    int money = sc.nextInt();
		    System.out.println("money=" + money);
		    for (int i = 0; i < coinUnit.length; i++) {
		        System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]);
		        money %= coinUnit[i];
		    }
	}

