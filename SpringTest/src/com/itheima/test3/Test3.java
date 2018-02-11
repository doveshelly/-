package com.itheima.test3;
/*
 * 打印出四位数字中个位+百位=十位+千位并且个位数为偶数，
 * 千位数为奇数的数字,并打印符合条件的数字的个数(符合条件的数字,每行显示5个,用空格隔开）
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
		System.out.println("符合条件的数总共有"+count+"个");
	}
}
