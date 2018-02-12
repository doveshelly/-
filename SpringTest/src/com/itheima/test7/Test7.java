package com.itheima.test7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �з�������5���ˣ���Ϣ���£�������-���ʣ�������=2100, ����=1700, �����=1800, ���ʦ̫=2600, ��������=3800��
a.������Ա���������Ϣ������ʺϵļ�����
b.�������ǹ���300
c.�����ʴ��ڵ���2000��Ա������д��D:\\info.txt��
 */
public class Test7 {
	public static void main(String[] args) throws IOException {
		//��������
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee e1= new Employee("����",2100);
		Employee e2= new Employee("����",1700);
		Employee e3= new Employee("�����",1800);
		Employee e4= new Employee("���ʦ̫",2600);
		Employee e5= new Employee("��������",3800);
		//���뼯��
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		//��������.��������
		for (int i = 0; i <list.size(); i++) {
			Employee e= list.get(i);
			if (e.getName().equals("����")) {
				e.setSalary(e.getSalary()+300);
			}
		}
		//���������������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\info.txt"));
		//��������
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			if (e.getSalary()>=2000) {
				bw.write(e.getName()+"-"+e.getSalary());
				bw.newLine();
				bw.flush();
			}
		}
		//�ر���Դ
		bw.close();
	}
}
