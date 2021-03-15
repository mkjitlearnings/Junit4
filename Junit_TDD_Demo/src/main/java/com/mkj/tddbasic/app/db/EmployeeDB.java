package com.mkj.tddbasic.app.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mkj.tddbasic.app.dto.Employee;

public class EmployeeDB {
	
	static List<Employee> list = new ArrayList<>();
	
	static
	{
		list.add(new Employee(1, "A",2000, "p1"));
		list.add(new Employee(2, "B",2000, "p2"));
		list.add(new Employee(4, "C",2000, "p2"));
		
		
	}
	public static List<Employee> getEmployeeDBList()
	{
		return list;
	}
	
	public static boolean insertEmployee(Employee e)
	{
		return list.add(e);
	}

}
