package com.itheima.test20;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��������Ҫ����ɲ�����
a. �������8��1-20֮���ż������ŵ����ʵļ����У�
PS: ��Χ����1��20
b.	�������Щ�������ƽ��ֵ�����; 
c.	��С��ƽ��ֵ�����ִӼ�����ɾ����
d.	ʹ�����ַ�ʽ�������е�Ԫ�����������̨
 */
public class Test20 {
	public static void main(String[] args) {
		//�������������
		Random r = new Random();
		//��������
		ArrayList<Integer> list =  new ArrayList<Integer>();
		int sum = 0;
		while (list.size()<=8) {
			int temp = r.nextInt(20)+1;
			if (temp%2==0) {
				sum +=temp;
				list.add(temp);
			}
		}
		//��ƽ��ֵ
		int avg = sum/list.size();
		System.out.println(avg);
		//��������
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)<avg) {
				list.remove(i);
				i--;
			}
		}
		//ֱ�Ӵ�ӡ
		System.out.println(list);
		//������ӡ
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			if (i==list.size()-1) {
				System.out.println(list.get(i)+"]");
			}else {
				System.out.print(list.get(i)+", ");
			}
		}
	}
}
