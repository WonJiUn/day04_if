package day04_if;

import java.util.Scanner;

public class Quiz002 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String home = null;
		String company = null;
		
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			
			num = sc.nextInt();
			
			switch(num) {
			
			case 1 : 
				System.out.print("우리집 목적지 입력 : ");
				home = sc.next();
				break;
			case 2 : 
				System.out.print("회사 목적지 입력 : ");
				company = sc.next();
				break;
			case 3 :
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + company);
				break;
			default : 
				System.out.println("1 ~ 3을 입력해주세요");
			}
			if(num == 3)
				break;
			System.out.println();
			
		}
		
		
		
		
		
		
	}
}
