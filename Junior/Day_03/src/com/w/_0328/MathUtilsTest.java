package com.w._0328;

import java.util.Arrays;

public class MathUtilsTest {
	public static void main(String[] args) {
		int [] arr={1,6,8,5,7,3};
		int sum=MathUtils.addition(arr);
		System.out.println(sum);
		double l=MathUtils.cicr(3.5);
		System.out.println("԰���ܳ��ǣ�"+l);
		int [] sortArr=MathUtils.sort(arr);
		System.out.println("����������"+Arrays.toString(sortArr));
		double i=MathUtils.p(3.1415926);
		System.out.println("pa��ֵΪ��"+i);
	}
}
