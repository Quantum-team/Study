package javaOOP_01_2_28;

import java.util.Scanner;

//2�������˺š����룬ģ���¼���̡�
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String num = sc.next();
		System.out.println("���������룺");
		String password = sc.next();
		//�Ƚ��˺š�����
		if(num.equals("admin")) {
			//�˺Ŵ��ڡ����űȽ�����
			if(password.equals("1234")) {
				System.out.println("��¼�ɹ���");
			}else {
				System.out.println("�������");
			}
		}else {
			System.out.println("�˺Ų����ڣ�");
		}
	}

}
