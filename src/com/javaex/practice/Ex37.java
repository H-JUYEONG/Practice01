package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {

		// 사용자에게 연필의 개수와 인원수를 입력받아 모든인원에게 같은수의 연필을 나눠주려고 한다
		// 1인당 연필의 받을수 있는 연필의 개수와 나머지를 구하시오

		Scanner sc = new Scanner(System.in);

		System.out.print("전체 연필갯수를 입력해주세요: ");
		int pencil = sc.nextInt();

		System.out.print("전체 인원수를 입력해주세요: ");
		int people = sc.nextInt();

		int div = pencil / people;
		int remainder = pencil % people;

		System.out.println("1인당 연필의 갯수는 " + div + " 입니다.");
		System.out.println("연필의 나머지 갯수는 " + remainder + " 입니다.");

		sc.close();

	}

}