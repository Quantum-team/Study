package javaOOP_03_1;

public class Student {
	//����
	String name;
	int age;
	char sex;
	
	//���췽���Ĵ���
	public Student() {}
	public Student(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//��Ϊ
	public void study() {
		System.out.println("ѧ����ѧϰΪ����Ϊ�л�֮��������飩");
		System.out.printf("%s˵���ҽ���%d����,�������Ǹ�%s��\n",name,age,sex);
	}

}
