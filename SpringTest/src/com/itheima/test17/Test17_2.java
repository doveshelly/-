package com.itheima.test17;

public class Test17_2 {
	public static void main(String[] args) {
		String str = "itheimaoaitheimacastitheimama";
		String subStr = "itheima";
		// ��ʼ������
		int count = 0;
		//�ж�strĩβ�Ƿ���sunStr,�еĻ�count�������е�,ֱ��û��
		while (str.endsWith(subStr)) {
			count++;
			str = str.substring(0, str.length() - subStr.length());
		}
		//��subStr�и�str,ĩβû��subStr,ͷ�������Ƿ���subStr,�����������鳤��ʼ�ձ�sunStr������1
		String[] arr = str.split(subStr);
		count += arr.length - 1;
		System.out.println("���ֹ�" + count + "��");
	}
}
