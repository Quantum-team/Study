package com.w._0328;

public abstract class Animal {
	public abstract String predation();
	public void eat(){
		String food= predation();
		System.out.println("��ʳ������������"+food+"���ڿ�ʼ��ʳ");
	}
}

class Tiger extends Animal{
	@Override
	public String predation(){
		return "����";
	}
}

class Monkkey extends Animal{
	@Override
	public String predation(){
		return "�㽶";
	}
}

class Wolff extends Animal{
	@Override
	public String predation(){
		return "ϲ����";
	}
}