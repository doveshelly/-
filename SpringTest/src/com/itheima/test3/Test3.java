package com.itheima.test3;
/*
 * ��ӡ����λ�����и�λ+��λ=ʮλ+ǧλ���Ҹ�λ��Ϊż����
 * ǧλ��Ϊ����������,����ӡ�������������ֵĸ���(��������������,ÿ����ʾ5��,�ÿո������
 */
public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1000; i < 10000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000;
			if ((ge+bai==shi+qian)&&(ge%2==0)&&(qian%2==1)) {
				count++;
				System.out.print(i+" ");
				if (count%5==0) {
					System.out.println();
				}
			}
		}
		System.out.println("�������������ܹ���"+count+"��");
	}
}
