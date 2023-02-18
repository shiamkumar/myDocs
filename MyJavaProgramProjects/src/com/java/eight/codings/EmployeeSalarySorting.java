package com.java.eight.codings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalarySorting {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Jack", 30000);
		Employee e2 = new Employee(1002, "Peter", 50000);
		Employee e3 = new Employee(1003, "Kelly", 20000);
		Employee e4 = new Employee(1004, "John", 120000);

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4);
		List<Employee> sortedEmpList = empList.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.skip(3)
				.collect(Collectors.toList());
		System.out.println(sortedEmpList);
	}
}
