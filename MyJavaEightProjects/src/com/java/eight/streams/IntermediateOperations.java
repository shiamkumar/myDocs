package com.java.eight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {
	public static void main(String[] args) {
		
		System.out.println(getCustomers());

		System.out.println("***** Using Streams API - filter() *****");
		 List<Integer> filter = getCustomers().stream()
				.filter(customer -> customer.getId() > 102)
				.map(cust -> cust.getId())
				.collect(Collectors.toList());
		//filter.forEach(System.out::println);
		 System.out.println(filter);

		System.out.println("***** Using Streams API - map() *****");
		List<String> map = getCustomers().stream()
				.map(customer -> customer.getEmail().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(map);
		
		System.out.println("***** Using Streams API - flatMap() *****");
		List<String> flatMap = getCustomers().stream()
				.flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(flatMap);

		System.out.println("***** Using Streams API - distinct() *****");
		List<Integer> distinct = getCustomers().stream()
				.map(Customer::getId).distinct()
				.collect(Collectors.toList());
		System.out.println(distinct);

		System.out.println("***** Using Streams API - limit() *****");
		List<String> limit = getCustomers().stream()
				.map(product -> product.getName()).limit(3)
				.collect(Collectors.toList());
		System.out.println(limit);

		System.out.println("***** Using Streams API - skip() *****");
		List<String> skip = getCustomers().stream()
				.map(product -> product.getName()).skip(2)
				.collect(Collectors.toList());
		System.out.println(skip);
		
		System.out.println("***** Using Streams API - peek() *****");
		 Set<Customer> peek = getCustomers().stream()
				 .peek(System.out::println)
				.collect(Collectors.toSet());
		System.out.println(peek);

		System.out.println("***** Using Streams API - sorted() *****");
		List<String> sorted = getCustomers().stream()
				.map(product -> product.getName()).sorted()
				.collect(Collectors.toList());
		System.out.println(sorted);

		System.out.println("***** Using Streams API - sorted(Comparator.comparing()) *****");
		List<String> sortedComparator = getCustomers().stream()
				.sorted(Comparator.comparing(Customer::getName))
				.map(cust -> cust.getName())
				.collect(Collectors.toList());
		System.out.println(sortedComparator);
		

		
	}

	private static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(101, "john", "john@gmail.com", Arrays.asList("3979379555", "21654725")));
		customers.add(new Customer(102, "smith", "smith@gmail.com", Arrays.asList("8956386566", "2487238947")));
		customers.add(new Customer(103, "peter", "peter@gmail.com", Arrays.asList("3894638654", "3286768922")));
		customers.add(new Customer(104, "kelly", "kelly@gmail.com", Arrays.asList("4892468377", "5488987611")));
		customers.add(new Customer(105, "jack", "jack@gmail.com", Arrays.asList("7788994433", "4382445566")));
		customers.add(new Customer(105, "jack", "jack@gmail.com", Arrays.asList("7788994433", "4382445566")));
		return customers;
	}

}
