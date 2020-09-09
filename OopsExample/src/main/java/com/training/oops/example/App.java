package com.training.oops.example;

import com.training.oops.example.entity.Student;
import com.training.oops.example.input.InputDataImpl;
import com.training.oops.example.output.PrintData;
import com.training.oops.example.output.PrintStudentAddress;
import com.training.oops.example.output.PrintStudentData;
import com.training.oops.example.output.PrintStudentMarks;
import com.training.oops.example.percentage.CalculatePercentage;

public class App {
	static InputDataImpl data = new InputDataImpl();
	static Student student = data.fillStudentData();

	public static void main(String[] args) {
		// printing Student Data
		PrintData printStudentData = new PrintStudentData();
		printStudentData.printHeader();
		printStudentData.print(student);

		// printing student address
		PrintData printStudentAddress = new PrintStudentAddress();
		printStudentAddress.print(student);

		// printing student marks
		PrintData printStudentMarks = new PrintStudentMarks();
		printStudentMarks.print(student);

		// printing student passed class
		App.getPassedClass();

	}

	public static void getPassedClass() {
		int marks = (int) Math.round(CalculatePercentage.percentageCalculator(student.getMarks()));
		System.out.println("\n----------------\n");
		if (marks > 75) {
			System.out.println("Congratulations!! you passed for your exams with distinction");
		} else if (75 > marks && marks > 60) {
			System.out.println("Congratulations!! you passed for your exams with first class");
		} else if (60 > marks && marks > 45) {
			System.out.println("Congratulations!! you passed passed for your exams with second class");
		} else if (45 > marks && marks > 35) {
			System.out.println("Congratulations!! you passed for your exams ");
		} else {
			System.out.println("You failed the examiniation");
		}
	}
}
