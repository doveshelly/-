package com.itheima2;
//定义节点类,属性包括节点值,以及节点的一下节点引用
public class Node {
	private int data;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int data) {
		this.data = data;
	}
	
}
