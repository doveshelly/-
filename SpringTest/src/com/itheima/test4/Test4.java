package com.itheima.test4;

import java.util.ArrayList;

/*
 * 两个集合{“a”，“b”，“c”，“d”，“e”}和{“d”，“e”，“f”，“g”，“h”},
	把这两个集合去除重复项合并成一个

 */
public class Test4 {
	public static void main(String[] args) {
		//创建两个集合
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		//添加元素
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
			//定义标签
			int flag = 0;
			//遍历arr1数组
			for (int j = 0; j < arr1.size(); j++) {
				///如果arr2的第i索引元素与arr1中某个元素相等,标签值为-1,且跳出循环
				if (arr2.get(i).equals(arr1.get(j))) {
					flag=-1;
					break;
				}
			}
			//如果标签值为0,即arr2的元素在arr1中没有相等的,则添加到arr1中
			if (flag==0) {
				arr1.add(arr2.get(i));
			}
		}
		//输出arr1
		System.out.println(arr1);
	}
}
