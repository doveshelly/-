package com.itheima.test4;

import java.util.ArrayList;

/*
 * ��������{��a������b������c������d������e��}��{��d������e������f������g������h��},
	������������ȥ���ظ���ϲ���һ��

 */
public class Test4 {
	public static void main(String[] args) {
		//������������
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		//���Ԫ��
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");
		arr1.add("e");
		arr2.add("d");
		arr2.add("e");
		arr2.add("f");
		arr2.add("g");
		arr2.add("h");
		
		for (int i = 0; i < arr2.size(); i++) {
			//�����ǩ
			int flag = 0;
			//����arr1����
			for (int j = 0; j < arr1.size(); j++) {
				///���arr2�ĵ�i����Ԫ����arr1��ĳ��Ԫ�����,��ǩֵΪ-1,������ѭ��
				if (arr2.get(i).equals(arr1.get(j))) {
					flag=-1;
					break;
				}
			}
			//�����ǩֵΪ0,��arr2��Ԫ����arr1��û����ȵ�,����ӵ�arr1��
			if (flag==0) {
				arr1.add(arr2.get(i));
			}
		}
		//���arr1
		System.out.println(arr1);
	}
}
