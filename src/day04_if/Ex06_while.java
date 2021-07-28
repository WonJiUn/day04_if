package day04_if;

import java.util.Scanner;

public class Ex06_while {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		int num = 1;
		
		if(num == 1) {
			name = "test";
		}
		
		//첫번째 글자가 소문자인 변수는 0으로 초기화
		//첫번째 글자가 대문자인 변수는 null로 초기화
		
		while(true) {
			System.out.print("이름입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 " + name + " 이군요");
		}
		
		
		
		
	}
}
