package day04_if;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		//문제는 년도를 입력받고,윤년인지 아닌지 판별하는 프로그램
		//(4의 배수이지만, 100의 배수는 윤년이 아닙니다. 하지만, 400의 배수는 윤년이라고 합니다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
		
		
		
	}
}
