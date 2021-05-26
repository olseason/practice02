package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("나이를 입력해주세요."); 
	    int a =sc.nextInt();
		int age = 15;
		
		if (18 > age && 0 < age) {                               //  (0<age<18)  ->  (18 > age && 0 < age) 
			System.out.println("청소년 입니다.");           
		}
		
		sc.close();

	}

}
