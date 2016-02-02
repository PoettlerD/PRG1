package org.campus02.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
ArrayList<Employee> list = new ArrayList<>();

public EmployeeManager(ArrayList<Employee> list) {
	super();
	this.list = list;
}

public void addEmployee(Employee e)
{
	list.add(e);
}

public double calcTotalSalary()
{
	double totalsalary = 0;
	for (Employee employee : list) {
		totalsalary += employee.getFullSalary();
	}
	return totalsalary;
}

public HashMap<String, Double> getSalaryByDepartment()
{
	HashMap<String, Double> tmp = new HashMap<>();
	
	for (Employee employee : list) {
		if (!tmp.containsKey(employee.department))
		{
		tmp.put(employee.department, employee.getFullSalary());
		}
		else
		{
		tmp.put(employee.department, tmp.get(employee.department)+employee.getFullSalary());
		}
		}
	return tmp;
}

}
