package com.itheima.test19;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		TestOne t = new TestOne();
		Scanner sc = new Scanner(System.in);
		System.out.println("������������µ����۶�:");
		int money = sc.nextInt();
		//�������
		double d = t.incom(money);
		System.out.println("����������������:"+d);
	}
}
