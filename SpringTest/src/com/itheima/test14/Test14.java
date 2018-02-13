package com.itheima.test14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test14 {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
		//定义接收数据变量
		String line;
		//定义读取行数初始化
		int hang=1;
		//定义集合来接收
		ArrayList<String> list = new ArrayList<String>();
		while ((line=br.readLine())!=null) {
			line+="--"+hang;
			list.add(line);
			hang++;
		}
		//定义高速输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		//关闭资源
		br.close();
		bw.close();
	}
}
