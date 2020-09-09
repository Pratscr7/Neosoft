package com.training.oops.example.input;

import com.training.oops.example.entity.Address;
import com.training.oops.example.entity.Marks;
import com.training.oops.example.entity.Student;

public class InputDataImpl implements InputData{

	public Student fillStudentData() {
		Student student = new Student();

		student.setName("Pratul");
		student.setNumber("9594244586");
		student.setRollNo(61);
		student.setAddress(getStudentAddress());
		student.setMarks(getStudentMarks());

		return student;
	}

	public Marks getStudentMarks() {
		Marks marks = new Marks();

		marks.setSub1(50);
		marks.setSub2(100);
		marks.setSub3(80);
		marks.setSub4(50);
		marks.setSub5(40);

		return marks;
	}

	public Address getStudentAddress() {
		Address address = new Address();

		address.setAddressLine("K.K tower, G.D Ambekar Road, Parel");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode(400012);

		return address;
	}

}
