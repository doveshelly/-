package com.itheima.test11;

import java.util.Scanner;

/*
 * �ӿ���̨����һ���ַ������������Ҫ��
 a�������ַ���ת�����ַ����飨������Ϊarr��
 b���ж�arr�����е�һ�������һ���ַ��Ƿ�������������򻥻�
 c�����������arr���±���ż�����ַ��á�*���Ŵ����Ԫ��
 */
public class Test11 {
	public static void main(String[] args) {
		//�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		//ת�����ַ�����
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
