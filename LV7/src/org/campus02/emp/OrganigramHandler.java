package org.campus02.emp;

import com.sun.jmx.mbeanserver.SunJmxMBeanServer;

public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee employee)
	{
		String chain = employee.getName().toString() + "[" + employee.getRole().toString()+"] ";
		if (employee.getSuperior() == null)
		{
			return chain;
		}
		
	
		
		return chain + " -> " + getChainOfCommand(employee.getSuperior());
		
	}
	

/*
public static String processHierachy (Employee emp)
{
	
	
	if (emp.getSubordinates() == null)
	{
		return "+["+emp.getRole().toString()+"] "+emp.getName().toString()+"\n";
	}
	String Hierachy = "+["+emp.getRole().toString()+"] "+emp.getName().toString()+"\n";
	for (Employee subEmp: emp.getSubordinates()) {
		//Hierachy += "-["+subEmp.getRole()+"] "+subEmp.getName()+"\n";
		return Hierachy + processHierachy(subEmp);
	}
	
	
	
	
	return Hierachy;
	
}
}

*/

	public static String processHierachy (Employee emp)
	{

		
		if (emp.getSubordinates().isEmpty())
		{
			return " - " + emp.getRole() + " "+emp.getName()+"\n";
		}

		String result = " + "+emp.getRole() + "("+emp.getName()+") \n";
		for (Employee e : emp.getSubordinates()) {
			result += processHierachy(e);
			
		}
		
		
		
		return result;
		
	}
	}
	

	


