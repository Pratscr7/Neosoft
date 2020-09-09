package com.training.oops.example.output;

import com.training.oops.example.entity.Student;
import com.training.oops.example.percentage.CalculatePercentage;

public class PrintStudentMarks extends PrintData {

	@Override
	public void print(Student student) {
		System.out.println("\n--------Marked Scored--------\n");
		System.out.println("Analysis of Algorithm: " + student.getMarks().getSub1());
		System.out.println("Data Structure: " + student.getMarks().getSub2());
		System.out.println("Object Oriented Programming: " + student.getMarks().getSub3());
		System.out.println("Machine Learning: " + student.getMarks().getSub4());
		System.out.println("Big Data: " + student.getMarks().getSub5());

		System.out.println("\n--------Percentage--------\n");
		System.out.println("Percentage Scored: " + CalculatePercentage.percentageCalculator(student.getMarks()));
	}

}
