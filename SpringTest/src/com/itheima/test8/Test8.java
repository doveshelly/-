package com.itheima.test8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ����һ��list����:{"�Ű�֥","���»�","����","����ӱ","��ӱ","������"}
a����дһ������:��list�������������ŵ���Աд�뵽D:\\a.txt��
b����дһ������:��D:\\a.txt���������ŵ���Ա��Ϣ��ȡ��������ӡ������̨��
 */
public class Test8 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list =new ArrayList<String>();
		list.add("�Ű�֥");
		list.add("���»�");
		list.add("����");
		list.add("����ӱ");
		list.add("��ӱ");
		list.add("������");
		//���������������������
		BufferedWriter bw= new BufferedWriter(new FileWriter("D:\\a.txt"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("��")) {
				bw.write(list.get(i));
				bw.newLine();
				bw.flush();
			}
		}
		//�����������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		//�ر���Դ
		bw.close();
		br.close();
	}
}
