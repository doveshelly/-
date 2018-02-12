package com.itheima.test6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * a、将该文件里面的所有元素都存放在list中
b、将list中重复元素删除
c、将去重后的集合中的所有元素放到到数组中，并按照从大到小的顺序排序后输出
d、将去重后的list中所有元素用两种方式打印出来
 */
public class Test6 {
	public static void main(String[] args) throws IOException {
		//创建集合
		ArrayList<String> list = new ArrayList<String>();
		//创建高速输入缓冲流
		BufferedReader br = new BufferedReader(new FileReader("number.txt"));
		//定义接收变量
		String line;
		while ((line=br.readLine())!=null) {
			list.add(line);
		}
		//去重
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					i--;
					break;
				}
			}
		}
		//存入数组
		int[]arr=new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(list.get(i));
		}
		//冒泡法排序
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//遍历数组
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+" ,");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
		//第一种方式打印集合
		System.out.println(list);
		//第二种方式打印集合
		System.out.print("[");
		for (int i = 0; i <list.size(); i++) {
			if (i!=list.size()-1) {
				System.out.print(list.get(i)+" ,");
			}else {
				System.out.print(list.get(i)+"]");
			}
		}
	}
}
