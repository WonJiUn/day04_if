package day04_if;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		//����1
		//���̸� �Է� �ް�
		//10�� �̻� 20�� �̸��̸� '10�� �Դϴ�' ���
		//20�� �̻� 30�� �̸��̸� '20�� �Դϴ�' ���
		//30�� �̻��̸� '30�� �̻� �Դϴ�' ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		if(age >= 30) {
			System.out.println("30�� �̻��Դϴ�");
		}
		else if (age >= 20) {
			System.out.println("20�� �Դϴ�");
		}
		else if (age >= 10) {
			System.out.println("10�� �Դϴ�");
		}
		else {
			System.out.println("�߸��� ���� �Է�");
		}
		
	}
}
