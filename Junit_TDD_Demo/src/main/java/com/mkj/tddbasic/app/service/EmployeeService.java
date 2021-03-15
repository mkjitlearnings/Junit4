package com.mkj.tddbasic.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mkj.tddbasic.app.db.EmployeeDB;
import com.mkj.tddbasic.app.dto.Employee;

public class EmployeeService {
	
	List<Employee> empList = EmployeeDB.getEmployeeDBList();
	
	public boolean addEmployee(Employee e)
	{
		return EmployeeDB.insertEmployee(e);
	}

	public List<Employee> getEmployees()
	{
		return empList;
	}
	
	public Employee getEmployeeById(int searchid)
	{
		for (Employee employee : empList) {
			if(employee.getId() == searchid) return employee;
		}
		
		return null;
	}
	
	
	
	public Employee getEmployeeByIdStreams(int searchid)
	{
		return empList.stream().filter((emp)->emp.getId()==searchid).findFirst().get();
	}
	
	
	public List<Employee> getEmployeeByProject(String project)
	{
		List<Employee> temp = new ArrayList<>();
		for (Employee employee : EmployeeDB.getEmployeeDBList()) {
			if(employee.getProjectname().equalsIgnoreCase(project))
			{
				temp.add(employee);
			}
		}
		
		if(temp.size()>0) return temp;
		else return null;
	}
	
}
