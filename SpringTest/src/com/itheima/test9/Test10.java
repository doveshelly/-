package com.itheima.test9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 产生10个1-100的随机数，并放到一个数组中
	(1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
	(2)把数组中小于10的数字放到一个map集合中，并打印到控制台。
	(3)把数组中的数字放到当前文件夹的number.txt文件中
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100)+1;
		}
		//创建集合
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> map = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=10) {
				list.add(arr[i]);
			}else {
				map.add(arr[i]);
			}
		}
		System.out.println(list);
		System.out.println(map);
		//创建高速输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\git\\SpringTest\\src\\com\\itheima\\test9\\number.txt"));
		for (int i = 0; i < arr.length; i++) {
			bw.write(new Integer(arr[i]).toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
