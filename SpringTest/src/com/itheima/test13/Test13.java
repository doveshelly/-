package com.itheima.test13;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Singer s = new Singer("������","��",35);
		Scanner sc = new Scanner(System.in);
		//��������
		String[] arr = new String[3];
		for (int i = 1; i < 4; i++) {
			System.out.println("�������"+i+"�׸������");
			String song = sc.nextLine();
			arr[i-1]=song;
		}
		Random r = new Random();
		//������������
		int temp = r.nextInt(3);
		s.sing(arr[temp]);
	}
}
