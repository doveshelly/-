package com.itheima.test12;

import java.util.ArrayList;

/*
 * �ַ�������strs�а����ַ���{"12","345","6789","1","123","4567"}������2��ArrayList���ϣ�
 �ֱ���strs�������ַ�������Ϊż����Ԫ�غ��ַ�������Ϊ������Ԫ�أ����ս������������ڿ���̨��ӡ�����
 */
public class Test12 {
	public static void main(String[] args) {
		String[] str = {"12","345","6789","1","123","4567"};
		//������������
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		//��������
		for (int i = 0; i < str.length; i++) {
			if (str[i].length()%2==0) {
				list1.add(str[i]);
			}else {
				list2.add(str[i]);
			}
		}
		System.out.println(list1);
		System.out.println(list2);
	}
}
