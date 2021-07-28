package day04_if;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		/* 정수를 입력 받아 계절을 나타내는 프로그램을 만든다.
		 * 3~5월 봄
		 * 6~8월 여름
		 * 9~11월 가을
		 * 12월 1~2월 겨울
		 * <출력 예시>
		 * 숫자를 입력해 주세요 : 3
		 * 현재 계절은 봄입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요(1~12월) : ");
		int num = sc.nextInt();
		
		if(num == 3 || num == 4 || num == 5) {
			System.out.println("현재 계절은 봄입니다");
		}
		else if(num == 6 || num == 7 || num == 8) {
			System.out.println("현재 계절은 여름입니다");
		}
		else if(num == 9 || num == 10 || num == 11) {
			System.out.println("현재 계절은 가을입니다");
		}
		else if(num == 12 || num == 1 || num == 2) {
			System.out.println("현재 계절은 겨울입니다");
		}
		else {
			System.out.println("잘못된 숫자 입력");
		}
		
	}
}
