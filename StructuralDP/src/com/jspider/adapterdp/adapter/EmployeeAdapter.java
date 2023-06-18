package com.jspider.adapterdp.adapter;

import com.jspider.adapterdp.interfaces.CompanyEvents;
import com.jspider.adapterdp.object.Employee;

public class EmployeeAdapter extends Employee implements CompanyEvents {
	@Override
	public void mothersDay() {
		EmployeeAdapter emp1 = new EmployeeAdapter();
		emp1.setEmp_id(1);
		emp1.setEmp_name("SHAM");
		System.out.println("Chief Guiest of event is: "+emp1.getEmp_name());
		
	}

	@Override
	public void fathersDay() {
		EmployeeAdapter emp2 = new EmployeeAdapter();
		emp2.setEmp_id(2);
		emp2.setEmp_name("RAM");
		System.out.println("Chief Guiest of event is: "+emp2.getEmp_name());
		
	}
	public static void main(String[] args) {
		EmployeeAdapter emp = new EmployeeAdapter();
		emp.fathersDay();
		emp.mothersDay();
	}

}
