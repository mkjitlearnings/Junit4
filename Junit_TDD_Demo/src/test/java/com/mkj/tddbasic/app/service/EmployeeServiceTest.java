package com.mkj.tddbasic.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mkj.tddbasic.app.db.EmployeeDB;
import com.mkj.tddbasic.app.dto.Employee;

class EmployeeServiceTest {

	List<Employee> empList = EmployeeDB.getEmployeeDBList();
	static EmployeeService empService;

	@BeforeAll
	static void initAll() {
		empService = new EmployeeService();
	}

	@Test
	void testAddEmployee() {

		boolean actual = empService.addEmployee(new Employee(103, "C", 2000, "p2"));
		assertTrue(actual);// checks whether actual has true value or not
		
		
		
	}

	@Test
	void testGetEmployees() {
		
		List<Employee> actual= empService.getEmployees();
		
		assertIterableEquals(EmployeeDB.getEmployeeDBList(), actual);
		// works on Collection
	}

	@Test
	void testGetEmployeeById() {
		Employee e = empService.getEmployeeById(1);
		System.out.println(e);
		//assertSame(new Employee(1, "A",2000, "p1"), e);
		assertEquals(new Employee(1, "A",2000, "p1"), e);
	}
/*
	@Test
	void testGetEmployeeByProject() {
		fail("Not yet implemented");
	}
*/
}
