package com.itheima.test9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ����10��1-100������������ŵ�һ��������
	(1)�������д��ڵ���10�����ַŵ�һ��list�����У�����ӡ������̨��
	(2)��������С��10�����ַŵ�һ��map�����У�����ӡ������̨��
	(3)�������е����ַŵ���ǰ�ļ��е�number.txt�ļ���
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100)+1;
		}
		//��������
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
		//���������������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\git\\SpringTest\\src\\com\\itheima\\test9\\number.txt"));
		for (int i = 0; i < arr.length; i++) {
			bw.write(new Integer(arr[i]).toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
