package com.Arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//input apple 30 orange 10 mango 20
class Register {

	private static final Register register = new Register();

	/*
	 * Complete the 'getTotalBill' function below.
	 *
	 * The function is expected to return a STRING. The function accepts MAP
	 * itemDetails as parameter.
	 */
	public static Register getInstance() {
		return register;
	}

	public String getTotalBill(Map<String, Integer> itemDetails) {
		Map<String, Double> stocks = new HashMap<>();
		stocks.put("apple", 2.0);
		stocks.put("orange", 1.5);
		stocks.put("mango", 1.2);
		stocks.put("grape", 1.0);
		double sum = 0;
		for (Map.Entry<String, Integer> entry : itemDetails.entrySet()) {
			sum += stocks.get(entry.getKey().trim().toLowerCase()) * entry.getValue();
		}
		return sum + "";

	}

}

public class New {
	public static void main(String[] args) throws IOException {

		Scanner readInput = new Scanner(System.in);
		String[] input = readInput.nextLine().split(" ");
		Map<String, Integer> myItems = new HashMap<String, Integer>();
		for (int i = 0; i < input.length; i += 2) {
			myItems.put(input[i], Integer.parseInt(input[i + 1]));
		}
		Register regObj = Register.getInstance();
		System.out.println(regObj.getTotalBill(myItems));
		readInput.close();

	}
}