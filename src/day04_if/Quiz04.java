package day04_if;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		//������ �⵵�� �Է¹ް�,�������� �ƴ��� �Ǻ��ϴ� ���α׷�
		//(4�� ���������, 100�� ����� ������ �ƴմϴ�. ������, 400�� ����� �����̶�� �մϴ�.)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("������ �ƴմϴ�");
		}
		
		
		
	}
}
