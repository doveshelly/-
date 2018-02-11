package com.itheima.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 4b.����Test�࣬��info.txt�ļ����ݶ�����Ŀ�У������ļ�����ʹ�����ι��촴��4��Ա�����󣻣��ļ����ݼ�PS��
 * /c.�������õ�4��Ա�����������ʵļ�����
 * /d.����Ӽ����г�ѡ1��Ա���������е�Ա���������������̨��
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		//������������������
		BufferedReader br = new BufferedReader(new FileReader("info.txt"));
		//����Ա������
		ArrayList<Employee> list = new ArrayList<Employee>();
		//����info�ļ�
		//��������ַ���
		String line;
		while ((line=br.readLine())!=null) {
			//���������������и����ַ���
			String[] arr = line.split("-");
			//����Ա������
			Employee em = new Employee(arr[0],arr[1],Integer.parseInt(arr[2]));
			//��em������뼯����
			list.add(em);
		}
		//�������������
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
