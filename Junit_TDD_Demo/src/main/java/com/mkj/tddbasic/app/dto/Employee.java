package com.mkj.tddbasic.app.dto;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String projectname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, String projectname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projectname = projectname;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public int hashCode() {
		return id+name.length()+projectname.length()+salary/2;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			
			boolean a = (this.id == e.id);
			boolean b = (this.salary == e.salary);
			boolean c = (this.name.equals(e.getName()));
			boolean d = (this.projectname.equals(e.getProjectname()));
			
			return a&b&c&d;
					
		}
		else
		{
			return false;
		}
		
		
	}
	@Override
	public String toString() {
		return id+" "+salary+" "+name+" "+projectname;
	}
	
	
	
	
}
