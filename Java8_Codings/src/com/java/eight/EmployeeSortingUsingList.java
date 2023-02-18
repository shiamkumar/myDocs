package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeSortingUsingList {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Jack", 23, 30000, "Male", "Accounts");
		Employee e2 = new Employee(1002, "Peter", 43, 50000, "Female", "IT");
		Employee e3 = new Employee(1003, "Kelly", 44, 20000, "Male", "Accounts");
		Employee e4 = new Employee(1004, "John", 22, 120000, "Female", "Accounts");
		Employee e5 = new Employee(1005, "Scott", 21, 70000, "Male", "IT");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5);
		List<Employee> sortedEmpList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(sortedEmpList);

		List<Employee> maleEmpList = empList.stream().filter(emp -> emp.getGender() == "Male")
				.collect(Collectors.toList());
		System.out.println(maleEmpList.size() + " : " + maleEmpList);

		List<Employee> femaleEmpList = empList.stream().filter(emp -> emp.getGender() == "Female")
				.collect(Collectors.toList());
		System.out.println(femaleEmpList.size() + " : " + femaleEmpList);

		List<Employee> seniorEmpList = empList.stream().filter(emp -> emp.getAge() > 40).collect(Collectors.toList());
		for (Employee emp : seniorEmpList) {
			System.out.println(emp.getName() + "_" + emp.getAge() + "_" + emp.getSalary());
		}

		Map<String, List<Employee>> groupedByDepartList = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
		System.out.println(groupedByDepartList);

		Map<String, Set<Employee>> res = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
		System.out.println(res);
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String gender;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, int salary, String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", department=" + department + "]";
	}

}