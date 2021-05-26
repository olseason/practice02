package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int n01 = sc.nextInt();
		System.out.print("숫자2: ");
		int n02 = sc.nextInt();
		
		if (n01 > n02) {
			System.out.println("큰수: " + n01 + "작은수: " + n02 + " 입니다.");
		} else if(n01 == n02) {
			System.out.println("큰수: " + n01 + "작은수: " + n02 + " 입니다.");
		} if (n01 < n02) {
			System.out.println("큰수: " + n02 + "작은수: " + n01 + " 입니다.");
		}
		
		sc.close();
		

	}

}
