package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//���� : ��� ������ 3.8�̻��̸�
		//('�����մϴ�! ���б� ���� ������Դϴ�')��� ����ϰ�
		//�ƴ϶�� 
		//('�ƽ����� ���б� ���� ����ڰ� �ƴմϴ�') ��� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �Է�(0 ~ 4.5) : ");
		double grade = sc.nextDouble();
		
		if(grade >= 3.8 && grade <= 4.5) {
			System.out.println("�����մϴ�! ���б� ���� ������Դϴ�");
		}
		else if(grade < 3.8 && grade >= 0) {
			System.out.println("�ƽ����� ���б� ���� ����ڰ� �ƴմϴ�");
		}
		else {
			System.out.println("�߸��� ���� �Է�");
		}
		
		
	}
}
