package org.campus02.Mitarbeiter;

public class FixCommissionEmployee extends Employee {
private double additionalCommission;

public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary,double additionalCommission) {
	super(lastname, firstname, department, baseSalary);
	this.additionalCommission = additionalCommission;
	// TODO Auto-generated constructor stub
}

@Override
public double getFullSalary() {
	// TODO Auto-generated method stub
	return baseSalary+additionalCommission;
}


}
