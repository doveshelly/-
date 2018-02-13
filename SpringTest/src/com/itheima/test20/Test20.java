package com.itheima.test20;

import java.util.ArrayList;
import java.util.Random;

/*
 * 按照以下要求，完成操作：
a. 随机生成8个1-20之间的偶数，存放到合适的集合中；
PS: 范围包括1和20
b.	计算出这些随机数的平均值并输出; 
c.	将小于平均值的数字从集合中删除；
d.	使用两种方式将集合中的元素输出到控制台
 */
public class Test20 {
	public static void main(String[] args) {
		//创建随机数对象
		Random r = new Random();
		//创建集合
		ArrayList<Integer> list =  new ArrayList<Integer>();
		int sum = 0;
		while (list.size()<=8) {
			int temp = r.nextInt(20)+1;
			if (temp%2==0) {
				sum +=temp;
				list.add(temp);
			}
		}
		//求平均值
		int avg = sum/list.size();
		System.out.println(avg);
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)<avg) {
				list.remove(i);
				i--;
			}
		}
		//直接打印
		System.out.println(list);
		//遍历打印
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
