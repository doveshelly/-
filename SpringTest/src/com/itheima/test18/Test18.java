package com.itheima.test18;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：（扩展）
	(1)键盘录入6个int类型的数据存数数组arr中
	(2)将arr数组中的内容反转
	(3)将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
	(4)最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
	(5)打印最终的数组(实现了1-4步之后的数组)
	(6)如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
 */
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 定义数组
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数");
			arr[i] = sc.nextInt();
		}
		// 反转
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// 将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
		for (int i = 1; i + 2 < arr.length; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 2];
			arr[i + 2] = temp;
		}
		// 最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
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
