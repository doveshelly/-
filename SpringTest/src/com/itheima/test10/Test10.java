package com.itheima.test10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * 根据以下要求实现相关功能
a.生成10个1-20之间的随机数
b.将这10个数字存放到List集合中
c.将这10个数字进行排序（降序，升序都可以）并且去重，然后再存放到当前项目下 number.txt中
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		ArrayList<Integer> list = new  ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(20)+1);
		}
		Collections.sort(list);
		System.out.println(list);
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
		System.out.println(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\git\\SpringTest\\src\\com\\itheima\\test10\\number.txt"));
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i).toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
