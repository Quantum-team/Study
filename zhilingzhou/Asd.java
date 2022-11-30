package com.java.first;

public class Asd {
public static void main (String[]args) {
	int i = 10;
	int j = 20;
	boolean a=i>j? true:false;
	System.out.println(a);
	
	double c=5;
	int b=2;
	System.out.println(c/b);
	
	String d="2";//数字和汉字都可以输
	char e='1';//只可以输一个字节
	
	System.out.println("it" + "heima");
	System.out.println("itheima" + 666+1);//字符串在前，数字连接
	System.out.println(666 + 1+"itheima");//字符串在后，数字相加
	System.out.println("ºÚÂí" + 6 + 66);
	System.out.println(1 + 99 + "ÄêºÚÂí");
	
	//i++先运算，再加1
	//++i先加1，再运算
	int f=12;
	int g=13;
	System.out.println(f++);
	System.out.println(++f);
	System.out.println(g++);
	System.out.println(++g);
	
}
}
