package day04_if;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		/* ������ �Է� �޾� ������ ��Ÿ���� ���α׷��� �����.
		 * 3~5�� ��
		 * 6~8�� ����
		 * 9~11�� ����
		 * 12�� 1~2�� �ܿ�
		 * <��� ����>
		 * ���ڸ� �Է��� �ּ��� : 3
		 * ���� ������ ���Դϴ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���(1~12��) : ");
		int num = sc.nextInt();
		
		if(num == 3 || num == 4 || num == 5) {
			System.out.println("���� ������ ���Դϴ�");
		}
		else if(num == 6 || num == 7 || num == 8) {
			System.out.println("���� ������ �����Դϴ�");
		}
		else if(num == 9 || num == 10 || num == 11) {
			System.out.println("���� ������ �����Դϴ�");
		}
		else if(num == 12 || num == 1 || num == 2) {
			System.out.println("���� ������ �ܿ��Դϴ�");
		}
		else {
			System.out.println("�߸��� ���� �Է�");
		}
		
	}
}
