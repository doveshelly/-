package com.itheima.test15;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		//�жϴ�Сд��ĸ����
		//�����Сд��ĸ����
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
		System.out.println("��д:"+bigCount);
		System.out.println("Сд:"+smallCount);
		System.out.println(newStr);
	}
}
