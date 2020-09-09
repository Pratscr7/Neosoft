package com.training.oops.example.output;

import com.training.oops.example.entity.Student;

public class PrintStudentAddress extends PrintData{

	@Override
	public void print(Student student) {
		System.out.println("Address: " + student.getAddress().getAddressLine());
		System.out.println("City: " + student.getAddress().getCity());
		System.out.println("Postal Code: " + student.getAddress().getPostalCode());
		System.out.println("State: " + student.getAddress().getState());
		System.out.println("Country:" + student.getAddress().getCountry());
	}

}
