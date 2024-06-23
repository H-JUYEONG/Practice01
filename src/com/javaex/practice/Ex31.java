package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		// 상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);

		System.out.print("상품가격 : ");
		double price = sc.nextDouble();
		
		System.out.print("받은돈 : ");
		double money = sc.nextDouble();
		
		System.out.println("======================");

		double surtax = price * 0.1;
		double balance = money - price;

		System.out.println("받은돈 : " + money);
		System.out.println("상품가격 : " + price);
		System.out.println("부가세 : " + surtax);
		System.out.println("잔액 : " + balance);
		

		sc.close();

	}

}