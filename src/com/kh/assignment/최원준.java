package com.kh.assignment;

import java.util.Scanner;

public class 최원준 {

	public void test() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("찾을 정수 한개를 입력 : ");
		int num = sc.nextInt();
		int arr[] = new int[] {1,5,8,9};
		
		if(num >= 1 && num <= 9 ) {
		for(int i = 0; i < arr.length; i++) {			
			if(num == arr[i]) {
				System.out.println("입력하신 " + num + "은"+ i + "번째에 존재합니다.");																
			}
		}
		}else {
			System.out.println("정수를 잘못입력했습니다");
		}
			
		
	}
}
