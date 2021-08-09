package com.Arrays;
import java.math.BigDecimal;

public class StudentClassRunner {
	public static void main(String[] args) {
//		int[] marks = { 97, 98, 100 };
		Student student = new Student("kks", 97, 98, 100);
		int number = student.getNumber();
		int sum = student.getTotalSumOfMarks();
		int maxMarks = student.getMaxMarks();
		int minMarks = student.getMinMarks();
		BigDecimal average = student.getAverageMarks();
		student.addMarks(91);
		student.removeMarksAtIndex(0);
		System.out.println(number + "\nmaxMarks = " + maxMarks);
		System.out.println("MinMarks = " + minMarks + "\ntotalSum = " + sum);
		System.out.println("Average Marks = " + average);
		System.out.println(student);
	}
}
