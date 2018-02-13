package com.itheima.test12;

import java.util.ArrayList;

/*
 * 字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，创建2个ArrayList集合，
 分别存放strs数组中字符串长度为偶数的元素和字符串长度为奇数的元素，最终将这两个集合在控制台打印输出：
 */
public class Test12 {
	public static void main(String[] args) {
		String[] str = {"12","345","6789","1","123","4567"};
		//创建两个集合
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		//遍历数组
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
