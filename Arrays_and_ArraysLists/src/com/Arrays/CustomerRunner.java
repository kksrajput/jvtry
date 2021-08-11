package com.Arrays;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("line 1", "Bangalore", "560061");
		Customer customer = new Customer("KKS", homeAddress);
		Address workAddress = new Address("line 2", "Bangalore", "560063");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
