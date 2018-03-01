package com.itheima2;
//��������,���԰���ͷ���ڵ��Լ�����Ԫ�ظ���
public class MyLinkedList {
	private Node first;
	private int size;
	public void insertFirst(int data){
		//ͷ����������,��ͷ���ڵ㻻��������Ľڵ�
		Node newNode = new Node(data);
		//β�˽ڵ�ָ��ԭ�ڵ�
		newNode.setNext(first);
		first = newNode;
		//�洢Ԫ�ؼ�һ
		size++;
	}
	//��������Ԫ�ظ�������
	public int size(){
		return size;
	}
	//����ɾ��ͷ�ڵ㷽��
	public boolean deleteFirst(){
		if (size==0) {
			return false;
		}
		 Node secondNode = first.getNext();
		//��Ϊͷ���ڵ�Ҫɾ��,������ý�ͷ���ڵ����һ��ָ����Ϊnull,�����ڴ�ռ��
		first.setNext(null);
		first = secondNode;
		size--;
		return true;
	}
	//������ҽڵ���������
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
	//���������ӡ�ڵ㷽��
	public void displayList(){
		
		Node node = first;
		while (node!=null) {
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}
		System.out.println();
	}
	
}
