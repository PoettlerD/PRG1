package org.campus02.emp;

public class EmployeeManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Max = new Employee(1, "Max", 12345.6, "IT");
		Employee Franz = new Employee(2, "Franz", 132345.6, "SALES");
		Employee Fritz = new Employee(3, "Fritz", 123145.6, "HR");
		
		EmployeeManager Manager1 = new EmployeeManager();
		
		Manager1.addEmployee(Fritz);
		Manager1.addEmployee(Max);
		Manager1.addEmployee(Franz);
		
		Manager1.findByDepartment("IT").toString();
		System.out.println(Manager1.findByMaxSalary().toString());
		System.out.println(Manager1.findByEmpNumber(2).toString());
		
		
		
	}

}
