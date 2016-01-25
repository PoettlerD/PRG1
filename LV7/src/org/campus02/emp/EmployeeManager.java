package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee e)
	{
		
		employees.add(e);
	}
	
	public Employee findByMaxSalary()
	{
		double maxSalary = 0;
		Employee EmployeemaxSalary = null;
		for (Employee employee : employees) {
			
			if(employee.getSalary() > maxSalary)
			{
				maxSalary = employee.getSalary();
				EmployeemaxSalary = employee;	
			}
			
		
		}
	
		return EmployeemaxSalary;
	
	}

	public Employee findByEmpNumber(int number)
	{
		
	
	 
	 
		for (Employee employee : employees) {
			if (employee.getEmpNumber() == number)
			{
				return employee;
			}
			
			
		}
		return null;
	}
	
	
	public  Employee find(Employee e)
	{
		int index = employees.indexOf(e);
		if (index == -1)
		{return  null;}
		return employees.get(index);
		
		
	}
	
	
	
	public ArrayList<Employee> findByDepartment(String department)
	{
		ArrayList<Employee> empindep = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getDepartment().equals(department))
			{
				empindep.add(employee);
			}
		}
	
	return empindep;
		
	}
	
	
	public ArrayList<Employee> getAllEmployees ()
	{
		
		return employees;
	}

	
}
