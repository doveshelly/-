package com.itheima.test8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 给定一个list集合:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明"}
a、编写一个方法:将list集合中所有姓张的人员写入到D:\\a.txt中
b、编写一个方法:将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
 */
public class Test8 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list =new ArrayList<String>();
		list.add("张柏芝");
		list.add("刘德华");
		list.add("张亮");
		list.add("张靓颖");
		list.add("杨颖");
		list.add("黄晓明");
		//创建高速输出缓冲流对象
		BufferedWriter bw= new BufferedWriter(new FileWriter("D:\\a.txt"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("张")) {
				bw.write(list.get(i));
				bw.newLine();
				bw.flush();
			}
		}
		//创建高速输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		//关闭资源
		bw.close();
		br.close();
	}
}
