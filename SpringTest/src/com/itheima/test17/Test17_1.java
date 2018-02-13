package com.itheima.test17;

public class Test17_1 {
	public static void main(String[] args) {
		String str = "itheimaoaitheimacastitheimama";
		String subStr = "itheima";
		//初始化计数
		int count = 0;
		//若str中有subStr,则indexOf的结果大于等于0,没有就是-1
		while (str.indexOf(subStr)>=0) {
			count++;
			int index = str.indexOf(subStr);
			str = str.substring(index+subStr.length());
		}
		System.out.println("出现过"+count+"次");
	}
}
