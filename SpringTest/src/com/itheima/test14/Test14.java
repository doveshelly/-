package com.itheima.test14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test14 {
	public static void main(String[] args) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
		//����������ݱ���
		String line;
		//�����ȡ������ʼ��
		int hang=1;
		//���弯��������
		ArrayList<String> list = new ArrayList<String>();
		while ((line=br.readLine())!=null) {
			line+="--"+hang;
			list.add(line);
			hang++;
		}
		//��������������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		//�ر���Դ
		br.close();
		bw.close();
	}
}
