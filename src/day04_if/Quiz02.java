package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//문제 : 평균 학점이 3.8이상이면
		//('축하합니다! 장학금 지금 대상자입니다')라고 출력하고
		//아니라면 
		//('아쉽지만 장학금 지급 대상자가 아닙니다') 라고 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("평균학점 입력(0 ~ 4.5) : ");
		double grade = sc.nextDouble();
		
		if(grade >= 3.8 && grade <= 4.5) {
			System.out.println("축하합니다! 장학금 지급 대상자입니다");
		}
		else if(grade < 3.8 && grade >= 0) {
			System.out.println("아쉽지만 장학금 지급 대상자가 아닙니다");
		}
		else {
			System.out.println("잘못된 숫자 입력");
		}
		
		
	}
}
