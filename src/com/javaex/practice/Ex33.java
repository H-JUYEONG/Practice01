package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		// 사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("반지름: ");
		double radius = sc.nextDouble();

		double volume = 4.0/3 * 3.14 * Math.pow(radius, 3);

		System.out.println("구의 부피는: " + volume + " 입니다.");

		sc.close();

	}

}