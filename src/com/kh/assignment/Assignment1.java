package com.kh.assignment;

import java.util.Scanner;

public class Assignment1 {
	
	
	//
	// ����ڿ��� �ݾ��� �Է¹޾� �Ž������� �ִ� ���α׷��� �ۼ�. �迭���. 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int[] coinUnit = { 50000,10000,5000,1000,500, 100, 50, 10 };
		 System.out.println("�ݾ� �Է� : ");
		    int money = sc.nextInt();
		    System.out.println("money=" + money);
		    for (int i = 0; i < coinUnit.length; i++) {
		        System.out.println(coinUnit[i]+"��: "+ money / coinUnit[i]);
		        money %= coinUnit[i];
		    }
	}
}
