package com.itheima.test5;

import java.util.ArrayList;

/*
 * ��֪һ��list���ϣ������Ԫ����:[10,4,1,2,6,5,8,3]
  a����list�����е�Ԫ�ذ���������(����ʹ��Collections������)
  b����������е����ֵ����Сֵ���������ֵ����Сֵλ���ϵ�Ԫ�ؽ��н���
 */
public class Test5 {
	public static void main(String[] args) {
		//��������
		ArrayList<Integer> array = new ArrayList<Integer>();
		//���Ԫ��
		array.add(10);
		array.add(4);
		array.add(1);
		array.add(2);
		array.add(6);
		array.add(5);
		array.add(8);
		array.add(3);
		int temp = 0;
		//ð�Ʒ�����
		for (int i = 0; i < array.size()-1; i++) {
			for (int j = 0; j < array.size()-1-i; j++) {
				if (array.get(j).compareTo(array.get(j+1))<0) {
					temp=array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, temp);
				}
			}
		}
		//��֤���
		System.out.println(array);
		//��������λ��ĩλ����Ԫ��
		temp=array.get(0);
		array.set(0, array.get(array.size()-1));
		array.set(array.size()-1, temp);
		//��֤���
		System.out.println(array);
	}
}
