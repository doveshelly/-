package com.itheima2;

public class Demo {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.displayList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		//打印链表
		list.displayList();
		//查找元素4所在的索引
		System.out.println(list.searchNode(4));
		System.out.println("--------");
		//删除链表头部节点
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		list.displayList();
		//打印链表元素个数
		System.out.println(list.size());
	}
}
