package com.itheima2;

public class Demo {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.displayList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		//��ӡ����
		list.displayList();
		//����Ԫ��4���ڵ�����
		System.out.println(list.searchNode(4));
		System.out.println("--------");
		//ɾ������ͷ���ڵ�
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		list.displayList();
		//��ӡ����Ԫ�ظ���
		System.out.println(list.size());
	}
}
