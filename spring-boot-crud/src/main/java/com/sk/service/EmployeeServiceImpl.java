package com.sk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Employee;
import com.sk.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return empRepo.findById(id);
	}
	
	@Override
	public List<Employee> getEmployeeByIdAndName(Long id, String name) {
		return empRepo.findByIdAndName(id, name);
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
	}



}
