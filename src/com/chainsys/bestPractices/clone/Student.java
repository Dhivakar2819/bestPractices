package com.chainsys.bestPractices.clone;

public class Student implements Cloneable {
	public String name;
	public int age;
	//@override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
