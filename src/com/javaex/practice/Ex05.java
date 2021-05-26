package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int tall = sc.nextInt();
		System.out.print("몸무게: ");
		int wei = sc.nextInt();
		
		double add = (tall - wei)*0.9;

		if (add>=100 && add<73) {
			System.out.println("과체중 입니다.");
		} else if (72>=add && add<61) {
			System.out.println("표준 입니다.");
		} else if (60>=add) {
			System.out.println("저체중 입니다.");
		}
		
		sc.close();

  }
}