package day04_if;

import java.util.Scanner;

public class Quiz002 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String home = null;
		String company = null;
		
		while(true) {
			System.out.println("1. �츮�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��� ����");
			
			num = sc.nextInt();
			
			switch(num) {
			
			case 1 : 
				System.out.print("�츮�� ������ �Է� : ");
				home = sc.next();
				break;
			case 2 : 
				System.out.print("ȸ�� ������ �Է� : ");
				company = sc.next();
				break;
			case 3 :
				System.out.println("�츮�� : " + home);
				System.out.println("ȸ�� : " + company);
				break;
			default : 
				System.out.println("1 ~ 3�� �Է����ּ���");
			}
			if(num == 3)
				break;
			System.out.println();
			
		}
		
		
		
		
		
		
	}
}
