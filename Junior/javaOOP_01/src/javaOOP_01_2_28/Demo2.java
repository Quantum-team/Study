package javaOOP_01_2_28;

import java.util.Scanner;

//1��������ݣ�Ȼ���ж���������껹��ƽ�ꣿ
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.printf("%d�������꣡",year);
		}else {
			System.out.printf("%d����ƽ�꣡",year);
		}
	}

}
