package com.training.oops.example.output;

import com.training.oops.example.entity.Student;

public class PrintStudentData extends PrintData{

	@Override
	public void print(Student student) {
		System.out.println("Name: " + student.getName());
		System.out.println("RollNo.: " + student.getRollNo());
		System.out.println("Number: " + student.getNumber());
	}

}
