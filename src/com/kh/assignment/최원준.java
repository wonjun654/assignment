package com.kh.assignment;

import java.util.Scanner;

public class �ֿ��� {

	public void test() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("ã�� ���� �Ѱ��� �Է� : ");
		int num = sc.nextInt();
		int arr[] = new int[] {1,5,8,9};
		
		if(num >= 1 && num <= 9 ) {
		for(int i = 0; i < arr.length; i++) {			
			if(num == arr[i]) {
				System.out.println("�Է��Ͻ� " + num + "��"+ i + "��°�� �����մϴ�.");																
			}
		}
		}else {
			System.out.println("������ �߸��Է��߽��ϴ�");
		}
			
		
	}
}
