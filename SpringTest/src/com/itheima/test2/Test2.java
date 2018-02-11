package com.itheima.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 4b.创建Test类，将info.txt文件内容读到项目中，根据文件内容使用满参构造创建4个员工对象；（文件内容见PS）
 * /c.将创建好的4个员工对象存入合适的集合中
 * /d.随机从集合中抽选1名员工，将抽中的员工姓名输出到控制台；
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		//创建高速输入流对象
		BufferedReader br = new BufferedReader(new FileReader("info.txt"));
		//创建员工集合
		ArrayList<Employee> list = new ArrayList<Employee>();
		//遍历info文件
		//定义接收字符串
		String line;
		while ((line=br.readLine())!=null) {
			//定义数组来接收切割后的字符串
			String[] arr = line.split("-");
			//创建员工对象
			Employee em = new Employee(arr[0],arr[1],Integer.parseInt(arr[2]));
			//将em对象存入集合中
			list.add(em);
		}
		//创建随机数对象
		Random r = new Random();
		Employee em2= list.get(r.nextInt(list.size()));
		System.out.println(em2.getName()+"-"+em2.getGender()+"-"+em2.getAge());
		System.out.println("---------------");
		for (int i = 0; i < list.size(); i++) {
			Employee em3= list.get(i);
			System.out.println(em3.getName()+"-"+em3.getGender()+"-"+em3.getAge());
		}
	}
}
