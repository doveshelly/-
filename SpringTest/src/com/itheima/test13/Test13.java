package com.itheima.test13;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Singer s = new Singer("王力宏","男",35);
		Scanner sc = new Scanner(System.in);
		//定义数组
		String[] arr = new String[3];
		for (int i = 1; i < 4; i++) {
			System.out.println("请输入第"+i+"首歌的名字");
			String song = sc.nextLine();
			arr[i-1]=song;
		}
		Random r = new Random();
		//定义接收随机数
		int temp = r.nextInt(3);
		s.sing(arr[temp]);
	}
}
