package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		//Q) �л��� ����, ����, ���� ������ ���� �Է¹ް� ����� ���� ���� ��� ������ �°� ����� ����ϼ���
		//	  (����� 90�� �̻� A, 80�� �̻� B, 70�� �̻� C, 60�� �̻� D, ������ F)
		
		
		Scanner sc = new Scanner(System.in);
		int kor, mat, eng;
		
		System.out.print("���������Է� : ");
		kor = sc.nextInt();
		System.out.print("���������Է� : ");
		mat = sc.nextInt();
		System.out.print("���������Է� : ");
		eng = sc.nextInt();
		
		double avg = (kor + mat + eng)/3.0;
		
		if(avg > 90) {
			System.out.println("��� : A");
		}
		else if(avg > 80) {
			System.out.println("��� : B");
		}
		else if(avg > 70) {
			System.out.println("��� : C");
		}
		else if(avg > 60) {
			System.out.println("��� : D");
		}
		else {
			System.out.println("��� : F");
		}
		
		
		
		
		
	}
}
