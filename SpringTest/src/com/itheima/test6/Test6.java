package com.itheima.test6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * a�������ļ����������Ԫ�ض������list��
b����list���ظ�Ԫ��ɾ��
c����ȥ�غ�ļ����е�����Ԫ�طŵ��������У������մӴ�С��˳����������
d����ȥ�غ��list������Ԫ�������ַ�ʽ��ӡ����
 */
public class Test6 {
	public static void main(String[] args) throws IOException {
		//��������
		ArrayList<String> list = new ArrayList<String>();
		//�����������뻺����
		BufferedReader br = new BufferedReader(new FileReader("number.txt"));
		//������ձ���
		String line;
		while ((line=br.readLine())!=null) {
			list.add(line);
		}
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
		//��������
		int[]arr=new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(list.get(i));
		}
		//ð�ݷ�����
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//��������
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+" ,");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
		//��һ�ַ�ʽ��ӡ����
		System.out.println(list);
		//�ڶ��ַ�ʽ��ӡ����
		System.out.print("[");
		for (int i = 0; i <list.size(); i++) {
			if (i!=list.size()-1) {
				System.out.print(list.get(i)+" ,");
			}else {
				System.out.print(list.get(i)+"]");
			}
		}
	}
}
