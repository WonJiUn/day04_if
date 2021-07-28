package day04_if;

import java.util.Scanner;

public class Quiz001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		while(true) {
			
			System.out.print("날짜 입력 : ");
			num1 = sc.nextInt();
			num2 = num1 % 7;
			
			switch(num2) {
			case 1 : System.out.println(num1 + " : 월요일"); break;
			case 2 : System.out.println(num1 + " : 화요일"); break;
			case 3 : System.out.println(num1 + " : 수요일"); break;
			case 4 : System.out.println(num1 + " : 목요일"); break;
			case 5 : System.out.println(num1 + " : 금요일"); break;
			case 6 : System.out.println(num1 + " : 토요일"); break;
			case 0 : System.out.println(num1 + " : 일요일"); break;
			}
		
		}
		
		
	}
}
