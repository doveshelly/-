package com.itheima.test16;
/*
 * ��һ���ַ���"hello world java ni hao shijie 123 456 99 88 java wo ai ni java hehe java heihei java"
	1)���ַ������տո��и�
	2)��ȡ�ַ�����"java"�ĸ���
	3)�ѳ���"java"�������ַ���װ��StringBuilder��
	4)��StringBuilder�����е������ַ��滻��*�ţ���ӡ������Ľ��
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
		//��StringBuilder�����е������ַ��滻��*�ţ���ӡ������Ľ��
		for (int i = 0; i < sb.length(); i++) {
			char chr = sb.charAt(i);
			if (chr>='0'&&chr<='9') {
				sb.setCharAt(i, '*');
			}
		}
		System.out.println(sb);
	}
}
