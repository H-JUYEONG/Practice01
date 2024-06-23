package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {

		// long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요. (단 빛의 속도는 300000 km/s 로 계산한다)

		long speedOfLight = 300000L; // 빛의 속도 = 300000 km/s

		long oneYear = 365 * 24 * 60 * 60; // 1년 동안의 시간(일,시,분,초)

		long distance = (speedOfLight * oneYear); // 거리 = 속도 X 시간

		System.out.println("빛이 1년 동안 가는 거리는 약 " + distance + " km 입니다.");

	}

}