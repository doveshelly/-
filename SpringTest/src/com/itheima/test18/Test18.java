package com.itheima.test18;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�����չ��
	(1)����¼��6��int���͵����ݴ�������arr��
	(2)��arr�����е����ݷ�ת
	(3)����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
	(4)����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
	(5)��ӡ���յ�����(ʵ����1-4��֮�������)
	(6)�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]
 */
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��������
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "������");
			arr[i] = sc.nextInt();
		}
		// ��ת
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// ����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
		for (int i = 1; i + 2 < arr.length; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 2];
			arr[i + 2] = temp;
		}
		// ����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i % 2 == 1) {
				int temp = arr[1];
				arr[1] = arr[i];
				arr[i] = temp;
				break;
			}
		}
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + " ,");
			}
		}
	}
}
