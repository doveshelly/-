package com.itheima.test10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * ��������Ҫ��ʵ����ع���
a.����10��1-20֮��������
b.����10�����ִ�ŵ�List������
c.����10�����ֽ������򣨽������򶼿��ԣ�����ȥ�أ�Ȼ���ٴ�ŵ���ǰ��Ŀ�� number.txt��
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
		//ȥ��
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
