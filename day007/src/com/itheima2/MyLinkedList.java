package com.itheima2;
//定义链表,属性包括头部节点以及链表元素个数
public class MyLinkedList {
	private Node first;
	private int size;
	public void insertFirst(int data){
		//头部插入数据,将头部节点换成新输入的节点
		Node newNode = new Node(data);
		//尾端节点指向原节点
		newNode.setNext(first);
		first = newNode;
		//存储元素加一
		size++;
	}
	//定义链表元素个数方法
	public int size(){
		return size;
	}
	//定义删除头节点方法
	public boolean deleteFirst(){
		if (size==0) {
			return false;
		}
		 Node secondNode = first.getNext();
		//因为头部节点要删除,所以最好将头部节点的下一个指向定义为null,减少内存占用
		first.setNext(null);
		first = secondNode;
		size--;
		return true;
	}
	//定义查找节点索引方法
	public int searchNode(int data){
		Node node = first;
		int index = 0;
		while (node!=null) {
			if (node.getData()==data) {
				return index;
			}
			index++;
			node = node.getNext();
		}
		return -1;
	}
	//定义遍历打印节点方法
	public void displayList(){
		
		Node node = first;
		while (node!=null) {
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}
		System.out.println();
	}
	
}
