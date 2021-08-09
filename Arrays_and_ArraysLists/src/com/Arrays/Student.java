package com.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private int number;
	private int maxMarks;
	private int minMarks;
	private int totalSumOfMarks;

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i : marks) {
			sum += i;
		}
		return sum;
	}

	public void setTotalSumOfMarks(int totalSumOfMarks) {
		this.totalSumOfMarks = totalSumOfMarks;
	}

	private BigDecimal averageMarks;

	public Student(String name, int... marks) {
		this.name = name;
//		this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumber() {
		return marks.size();
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMaxMarks() {
//		Collections.sort(marks);
//		return marks.get(marks.size() - 1);
		return Collections.max(marks);
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getMinMarks() {
//		return marks.get(0);
		return Collections.min(marks);
	}

	public void setMinMarks(int minMarks) {
		this.minMarks = minMarks;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumber();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public void setAverageMarks(BigDecimal averageMarks) {
		this.averageMarks = averageMarks;
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addMarks(int mark) {
		marks.add(mark);
	}

	public void removeMarksAtIndex(int i) {
		marks.remove(i);
	}

}
