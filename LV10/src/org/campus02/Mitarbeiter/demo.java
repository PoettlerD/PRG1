package org.campus02.Mitarbeiter;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PercentCommissionEmpolyee emp1 = new PercentCommissionEmpolyee("asd", "sad", "IT", 2000, 25.0);
		PercentCommissionEmpolyee emp2 = new PercentCommissionEmpolyee("a3sd", "sad", "IT", 2900, 35.0);
		FixCommissionEmployee femp1 = new FixCommissionEmployee("afsjkl", "isfi", "Sales", 4000, 750);
	EmployeeManager empmgr = new EmployeeManager(new ArrayList<Employee>());
	empmgr.addEmployee(emp1);
	empmgr.addEmployee(emp2);
	empmgr.addEmployee(femp1);
	
	System.out.println(empmgr.calcTotalSalary());
	System.out.println(empmgr.getSalaryByDepartment());
	
	}

}
