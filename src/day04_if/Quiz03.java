package day04_if;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		//문제1
		//나이를 입력 받고
		//10살 이상 20살 미만이면 '10대 입니다' 출력
		//20살 이상 30살 미만이면 '20대 입니다' 출력
		//30살 이상이면 '30대 이상 입니다' 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 30) {
			System.out.println("30대 이상입니다");
		}
		else if (age >= 20) {
			System.out.println("20대 입니다");
		}
		else if (age >= 10) {
			System.out.println("10대 입니다");
		}
		else {
			System.out.println("잘못된 숫자 입력");
		}
		
	}
}
