package com.itheima.test1;
/*
 * 1.�������������ַ�����"1.2,3.4,5.6,7.8,5.56,44.55"�밴��Ҫ����������������⡣
   ��1���Զ�����Ϊ�ָ���������֪���ַ����ֳ�һ��String���͵����飬�����е�ÿһ��Ԫ��������"1.2","3.4"�������ַ�����
   ��2���ѵ�һ�ʵõ��Ľ�����飬�Ӵ�С���򣬲���ӡ������̨
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "1.2,3.4,5.6,7.8,5.56,44.55";
		//��spilt�����и��ַ���
		String[] arr = str.split(",");
		Double[] arrd = new Double[arr.length];
		//���ַ�������ת��Ϊdouble��������
		for (int i = 0; i < arrd.length; i++) {
			arrd[i]=Double.parseDouble(arr[i]);
		}
		Double temp = new Double(0);
		//ð�ݷ�����
		for (int i = 0; i < arrd.length-1; i++) {
			for (int j = 0; j < arrd.length-1-i; j++) {
				temp = arrd[j];
				if (arrd[j].compareTo(arrd[j+1])<0) {
					arrd[j]=arrd[j+1];
					arrd[j+1]=temp;
				}
			}
		}
		//��ӡ����
		System.out.print("[");
		for (int i = 0; i < arrd.length; i++) {
			if (i==arrd.length-1) {
				System.out.print(arrd[i]+"]");
			}else {
				System.out.print(arrd[i]+" ,");
			}
		}
		
	}
}
