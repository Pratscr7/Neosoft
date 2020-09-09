package com.training.oops.example.percentage;

import com.training.oops.example.entity.Marks;

public class CalculatePercentage {

	public static double percentageCalculator(Marks marks) {
		double percentage = (double) 100
				* (marks.getSub1() + marks.getSub2() + marks.getSub3() + marks.getSub4() + marks.getSub5()) / 500;

		return percentage;
	}

}
