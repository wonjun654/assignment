package com.kh.assignment;

import java.util.Scanner;

public class lwkrun {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lwkexample test = new lwkexample();
		
		System.out.print("input first num : ");
		test.setNum1(sc.nextInt());
		System.out.print("input second num : ");
		test.setNum2(sc.nextInt());
		
		System.out.println("Add : " + test.returnAdd(test.getNum1(), test.getNum2()));
		System.out.println("Sub : " + test.returnSub(test.getNum1(), test.getNum2()));
		System.out.println("Mul : " + test.returnMul(test.getNum1(), test.getNum2()));
		System.out.println("Div : " + test.returnDiv(test.getNum1(), test.getNum2()));
	}

}
