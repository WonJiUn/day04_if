package day04_if;

import java.util.Scanner;

public class Quiz001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		while(true) {
			
			System.out.print("��¥ �Է� : ");
			num1 = sc.nextInt();
			num2 = num1 % 7;
			
			switch(num2) {
			case 1 : System.out.println(num1 + " : ������"); break;
			case 2 : System.out.println(num1 + " : ȭ����"); break;
			case 3 : System.out.println(num1 + " : ������"); break;
			case 4 : System.out.println(num1 + " : �����"); break;
			case 5 : System.out.println(num1 + " : �ݿ���"); break;
			case 6 : System.out.println(num1 + " : �����"); break;
			case 0 : System.out.println(num1 + " : �Ͽ���"); break;
			}
		
		}
		
		
	}
}
