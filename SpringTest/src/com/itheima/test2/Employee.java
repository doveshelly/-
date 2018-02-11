package com.itheima.test2;
/*
 * a.创建一个员工类（Employee），
 * 属性有：姓名（String类型）、性别（String类型）、年龄（int类型）；生成对应的set/get方法以及有参构造；
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
