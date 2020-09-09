package com.training.oops.example.entity;

public class Student {

	private int rollNo;
	private String name;
	private String number;
	private Address address;
	private Marks marks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

}
