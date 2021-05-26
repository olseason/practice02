package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);                   //다음 코드를 실행했을 때 결과를 쓰세요 
		                                                  
		System.out.println("나이를 입력해주세요");             // 나이 15  ->  	'2번그룹' 입니다.
		System.out.print("나이: ");                              // 나이 19  ->   '2번그룹' 입니다.
		age = sc.nextInt();                                    // 나이 20  ->   '2번그룹' 입니다.
		                                                       // 나이 21  ->   '1번그룹' 입니다.
		if(age > 20) {                                         // 나이 100 ->   '1번그룹' 입니다. 
			System.out.println("\'1번그룹\'");
		} else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");		
		
		sc.close();

	}

}
