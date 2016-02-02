package org.campus02.Mitarbeiter;

public class PercentCommissionEmpolyee extends Employee {
private double percentCommission;

public PercentCommissionEmpolyee(String lastname, String firstname, String department, double baseSalary,
		double percentCommission) {
	super(lastname, firstname, department, baseSalary);
	this.percentCommission = percentCommission;
}

@Override
public double getFullSalary() {
	// TODO Auto-generated method stub
	return (baseSalary*(1+percentCommission/100));
}


}
