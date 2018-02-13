package com.itheima.test15;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.nextLine();
		//判断大小写字母个数
		//定义大小写字母个数
		int bigCount=0;
		int smallCount=0;
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char chr = sb.charAt(i);
			if (chr>='A'&&chr<='Z') {
				bigCount++;
			} else if (chr>='a'&&chr<='z') {
				smallCount++;
			} else {
				sb.setCharAt(i, '*');
			}
		}
		String newStr = sb.toString();
		System.out.println("大写:"+bigCount);
		System.out.println("小写:"+smallCount);
		System.out.println(newStr);
	}
}
