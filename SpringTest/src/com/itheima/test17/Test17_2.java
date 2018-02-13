package com.itheima.test17;

public class Test17_2 {
	public static void main(String[] args) {
		String str = "itheimaoaitheimacastitheimama";
		String subStr = "itheima";
		// 初始化计数
		int count = 0;
		//判断str末尾是否有sunStr,有的话count自增且切掉,直到没有
		while (str.endsWith(subStr)) {
			count++;
			str = str.substring(0, str.length() - subStr.length());
		}
		//用subStr切割str,末尾没有subStr,头部不管是否有subStr,切下来的数组长度始终比sunStr个数多1
		String[] arr = str.split(subStr);
		count += arr.length - 1;
		System.out.println("出现过" + count + "次");
	}
}
