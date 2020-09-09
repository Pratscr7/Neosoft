package com.training.oops.example.input;

import com.training.oops.example.entity.Address;
import com.training.oops.example.entity.Marks;
import com.training.oops.example.entity.Student;

public interface InputData {

	public Student fillStudentData();

	public Marks getStudentMarks();

	public Address getStudentAddress();

}
