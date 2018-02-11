package com.itheima.test1;
/*
 * 1.有类似这样的字符串："1.2,3.4,5.6,7.8,5.56,44.55"请按照要求，依次完成以下试题。
   （1）以逗号作为分隔符，把已知的字符串分成一个String类型的数组，数组中的每一个元素类似于"1.2","3.4"这样的字符串。
   （2）把第一问得到的结果数组，从大到小排序，并打印到控制台
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "1.2,3.4,5.6,7.8,5.56,44.55";
		//用spilt方法切割字符串
		String[] arr = str.split(",");
		Double[] arrd = new Double[arr.length];
		//将字符串数组转化为double类型数组
		for (int i = 0; i < arrd.length; i++) {
			arrd[i]=Double.parseDouble(arr[i]);
		}
		Double temp = new Double(0);
		//冒泡法排序
		for (int i = 0; i < arrd.length-1; i++) {
			for (int j = 0; j < arrd.length-1-i; j++) {
				temp = arrd[j];
				if (arrd[j].compareTo(arrd[j+1])<0) {
					arrd[j]=arrd[j+1];
					arrd[j+1]=temp;
				}
			}
		}
		//打印数组
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
