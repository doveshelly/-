package com.itheima.test16;
/*
 * 有一个字符串"hello world java ni hao shijie 123 456 99 88 java wo ai ni java hehe java heihei java"
	1)把字符串按照空格切割
	2)获取字符串中"java"的个数
	3)把除了"java"的其他字符，装到StringBuilder中
	4)把StringBuilder中所有的数字字符替换成*号，打印输出最后的结果
 */
public class Test16 {
	public static void main(String[] args) {
		String str="hello world java ni hao shijie 123 456 99 88 java wo ai ni java hehe java heihei java";
		String[] arr = str.split(" ");
		int count=0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("java")) {
				count++;
			}else {
				sb.append(arr[i]);
			}
		}
		//把StringBuilder中所有的数字字符替换成*号，打印输出最后的结果
		for (int i = 0; i < sb.length(); i++) {
			char chr = sb.charAt(i);
			if (chr>='0'&&chr<='9') {
				sb.setCharAt(i, '*');
			}
		}
		System.out.println(sb);
	}
}
