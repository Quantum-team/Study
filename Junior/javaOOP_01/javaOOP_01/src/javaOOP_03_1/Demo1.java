package javaOOP_03_1;

public class Demo1 {
	//�޲��޷���ֵ
	public void aoo() {
		System.out.println("�����޲��޷���ֵ����");
	}
	//�޲��з���ֵ�ķ���
	public int boo() {
		System.out.println("�����޲��з���ֵ�ķ���");
		return 0;
	}
	//�в��޷���ֵ�ķ���
	public void coo(String str) {
		System.out.println("�����в��޷���ֵ�ķ��������Ҳ����ǣ�"+str);
	}
	//�����в��з���ֵ�ķ���
	public int doo(String str) {
		System.out.println("�����в��з���ֵ�ķ��������Ҳ����ǣ�"+str);
		return 0;
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.aoo();
		int a = d.boo();
		System.out.println(a);
		d.coo("����");
		int b = d.doo("Jack");
		System.out.println(b);
	}

}
