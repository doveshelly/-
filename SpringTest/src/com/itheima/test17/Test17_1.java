package com.itheima.test17;

public class Test17_1 {
	public static void main(String[] args) {
		String str = "itheimaoaitheimacastitheimama";
		String subStr = "itheima";
		//��ʼ������
		int count = 0;
		//��str����subStr,��indexOf�Ľ�����ڵ���0,û�о���-1
		while (str.indexOf(subStr)>=0) {
			count++;
			int index = str.indexOf(subStr);
			str = str.substring(index+subStr.length());
		}
		System.out.println("���ֹ�"+count+"��");
	}
}
