package com.itheima.test2;
/*
 * a.����һ��Ա���ࣨEmployee����
 * �����У�������String���ͣ����Ա�String���ͣ������䣨int���ͣ������ɶ�Ӧ��set/get�����Լ��вι��죻
 */
public class Employee {
	private String name;
	private String gender;
	private int age;
	public Employee() {
		super();
	}
	public Employee(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
