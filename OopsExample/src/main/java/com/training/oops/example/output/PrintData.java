package com.training.oops.example.output;

import com.training.oops.example.entity.Student;

public abstract class PrintData {
	
	public void printHeader() {
		System.out.println("----------Student Details----------\n");
	}
	
	public abstract void print(Student student);

}

