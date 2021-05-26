package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫번째 숫자:");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자:");
		int num2 = sc.nextInt();
		
		int a =  num2 / num1 ;
		int a1 =  num2 & num1;
		
		
		if (num1>num2) {
			System.out.println("몫:" + a );
			System.out.println("나머지:" + a1 );
		}
		
		
		
		
		sc.close();
		

	}

}
