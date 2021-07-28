package day04_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		//Q) 학생의 국어, 수학, 영어 점수를 각각 입력받고 평균을 구한 다음 평균 점수에 맞게 등급을 출력하세요
		//	  (등급은 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F)
		
		
		Scanner sc = new Scanner(System.in);
		int kor, mat, eng;
		
		System.out.print("국어점수입력 : ");
		kor = sc.nextInt();
		System.out.print("수학점수입력 : ");
		mat = sc.nextInt();
		System.out.print("영어점수입력 : ");
		eng = sc.nextInt();
		
		double avg = (kor + mat + eng)/3.0;
		
		if(avg > 90) {
			System.out.println("등급 : A");
		}
		else if(avg > 80) {
			System.out.println("등급 : B");
		}
		else if(avg > 70) {
			System.out.println("등급 : C");
		}
		else if(avg > 60) {
			System.out.println("등급 : D");
		}
		else {
			System.out.println("등급 : F");
		}
		
		
		
		
		
	}
}
