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
		
		//ù��° ���ڰ� �ҹ����� ������ 0���� �ʱ�ȭ
		//ù��° ���ڰ� �빮���� ������ null�� �ʱ�ȭ
		
		while(true) {
			System.out.print("�̸��Է� : ");
			name = input.next();
			System.out.println("����� �̸��� " + name + " �̱���");
		}
		
		
		
		
	}
}
