package javaOOP_03_1;

public class StudentTest {
	public static void main(String[] args) {
		//����ѧ������
		Student stu = new Student();
		//Ϊ���Ը�ֵ
		stu.name = "���Һ�";
		stu.age = 25;
		stu.sex = 'Ů';
		//���÷���
		stu.study();
		
		Student student = new Student("С��",20,'��');
		student.study();
		
	}

}
