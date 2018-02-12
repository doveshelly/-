package com.itheima.test7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 研发部门有5个人，信息如下：（姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败=3800】
a.将以上员工的相关信息存放在适合的集合中
b.给柳岩涨工资300
c.将工资大于等于2000的员工名单写入D:\\info.txt中
 */
public class Test7 {
	public static void main(String[] args) throws IOException {
		//创建集合
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee e1= new Employee("柳岩",2100);
		Employee e2= new Employee("张亮",1700);
		Employee e3= new Employee("诸葛亮",1800);
		Employee e4= new Employee("灭绝师太",2600);
		Employee e5= new Employee("东方不败",3800);
		//存入集合
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		//遍历集合.查找柳岩
		for (int i = 0; i <list.size(); i++) {
			Employee e= list.get(i);
			if (e.getName().equals("柳岩")) {
				e.setSalary(e.getSalary()+300);
			}
		}
		//创建高速输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\info.txt"));
		//遍历集合
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			if (e.getSalary()>=2000) {
				bw.write(e.getName()+"-"+e.getSalary());
				bw.newLine();
				bw.flush();
			}
		}
		//关闭资源
		bw.close();
	}
}
