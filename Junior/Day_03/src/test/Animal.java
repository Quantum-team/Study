package test;

public abstract class Animal {
	public abstract void play(); 
}
class Cat extends Animal{
@Override
public void play() {
	System.out.println("����è����������");
	}
}
class Dog extends Animal{
	@Override
	public void play() {
		System.out.println("���ǹ���������");
	}
}