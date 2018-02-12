package com.itheima.test5;

import java.util.ArrayList;

/*
 * 已知一个list集合，里面的元素有:[10,4,1,2,6,5,8,3]
  a、将list中所有的元素按降序排序(不能使用Collections工具类)
  b、求出集合中的最大值和最小值，并将最大值和最小值位置上的元素进行交换
 */
public class Test5 {
	public static void main(String[] args) {
		//创建集合
		ArrayList<Integer> array = new ArrayList<Integer>();
		//添加元素
		array.add(10);
		array.add(4);
		array.add(1);
		array.add(2);
		array.add(6);
		array.add(5);
		array.add(8);
		array.add(3);
		int temp = 0;
		//冒牌发排序
		for (int i = 0; i < array.size()-1; i++) {
			for (int j = 0; j < array.size()-1-i; j++) {
				if (array.get(j).compareTo(array.get(j+1))<0) {
					temp=array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, temp);
				}
			}
		}
		//验证结果
		System.out.println(array);
		//将集合首位与末位交换元素
		temp=array.get(0);
		array.set(0, array.get(array.size()-1));
		array.set(array.size()-1, temp);
		//验证结果
		System.out.println(array);
	}
}
