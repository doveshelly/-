package com.itheima.test19;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		TestOne t = new TestOne();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您这个月的销售额:");
		int money = sc.nextInt();
		//接收提成
		double d = t.incom(money);
		System.out.println("您这个月所得提成是:"+d);
	}
}
