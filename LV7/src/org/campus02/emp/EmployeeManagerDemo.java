package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Employee Max = new Employee(1, "Max", 12345.6, "IT");
		Employee Franz = new Employee(2, "Franz", 132345.6, "SALES");
		Employee Fritz = new Employee(3, "Fritz", 123145.6, "HR");
		
		EmployeeManager Manager1 = new EmployeeManager();
		
		Manager1.addEmployee(Fritz);
		Manager1.addEmployee(Max);
		Manager1.addEmployee(Franz);
		
		Manager1.findByDepartment("IT").toString();
		System.out.println(Manager1.findByMaxSalary().toString());
		System.out.println(Manager1.findByEmpNumber(2).toString());*/
		
		Employee employee1 = new Employee(1, "Mitarbeiter 1", 100000, "BOSS", "CEO", null, new ArrayList<Employee>());
		Employee employee2 = new Employee(2, "Mitarbeiter 2", 100000, "Mini Boss", "CTO", null, new ArrayList<Employee>());
		Employee employee3 = new Employee(3, "Mitarbeiter 3", 100000, "Dev", "Dev", null, new ArrayList<Employee>());
		Employee employee4 = new Employee(4, "Mitarbeiter 4", 100000, "Dev", "Dev", null, new ArrayList<Employee>());
		Employee employee5 = new Employee(5, "Mitarbeiter 5", 100000, "Mini Boss", "HR", null, new ArrayList<Employee>());
		//Employee employee6 = new Employee(5, "Mitarbeiter 6", 100000, "Lehrbua", "Dev", null, new ArrayList<Employee>());
		
		
		employee1.addSubordinates(employee2); 
		employee1.addSubordinates(employee5);
		//employee3.addSubordinates(employee6);
		employee2.addSubordinates(employee3);
		employee2.addSubordinates(employee4);
		
		employee2.setSuperior(employee1);
		employee5.setSuperior(employee1);
		
		employee3.setSuperior(employee2);
		employee4.setSuperior(employee2);
		
		employee1.setSuperior(null);
	
		EmployeeManager Manager1 = new EmployeeManager();
		Manager1.addEmployee(employee1);
		Manager1.addEmployee(employee2);
		Manager1.addEmployee(employee3);
		Manager1.addEmployee(employee4);
		Manager1.addEmployee(employee5);
		
		for (Employee emp : Manager1.getAllEmployees()) {
			System.out.println(OrganigramHandler.getChainOfCommand(emp));
		}
		System.out.println("////////////////////");
		System.out.println(OrganigramHandler.processHierachy(employee1," "));
		
		
	//	System.out.println(OrganigramHandler.getChainOfCommand(employee4));
		
		
	}

}
