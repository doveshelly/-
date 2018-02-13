package com.itheima.test11;

import java.util.Scanner;

/*
 * 从控制台接收一串字符串，完成以下要求
 a、将该字符串转换成字符数组（数组名为arr）
 b、判断arr数组中第一个和最后一个字符是否相等如果不相等则互换
 c、将互换后的arr中下标是偶数的字符用“*”号代替该元素
 */
public class Test11 {
	public static void main(String[] args) {
		//创建输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符串");
		String str = sc.nextLine();
		//转换成字符数组
		char[] arr = str.toCharArray();
		if (arr[0]!=arr[arr.length-1]) {
			char temp = arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				arr[i]='*';
			}
			System.out.print(arr[i]);
		}
	}
}
