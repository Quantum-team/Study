package javaOOP_03_1;

public class Animal {
	//����
	String name;
	int age;
	char sex;
	//����
	public void eat() {
		System.out.println("�����Զ���");
		System.out.println("��ֻ������"+sex+"�ģ�����"+name+"����"+age+"���ˡ�");
	}
	
	public Animal() {}
	public Animal(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	

}
