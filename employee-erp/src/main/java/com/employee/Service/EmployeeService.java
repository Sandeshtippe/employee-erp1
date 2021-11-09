package com.employee.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee2;

@Service
public class EmployeeService {

	List<Employee2> list = new ArrayList<Employee2>();

	public EmployeeService() {
		System.out.println("Service layer is created !!");
		list.add(new Employee2(101, "Sandesh", "Nodia"));
		list.add(new Employee2(102, "Akash", "Mumbai"));
		list.add(new Employee2(103, "Nileah", "Banglore"));

	}

	// Return all employee
	public List<Employee2> getAllEmployee() {
		return this.list;
	}

	// Return single employee
	public Employee2 getEmploye2(int id) {
		for (Employee2 employee : list) {
			if (employee.getEmpId() == id) {
				return employee;
			}
		}
		return null;
	}

	// Save employee
	public void saveEmployee(Employee2 employee) {
		this.list.add(employee);
	}

	// update employee
	public void updateEmployee(Employee2 employee) {

		for (Employee2 emp : list) {
			if (emp.getEmpId() == employee.getEmpId()) {
				emp.setEmpName(employee.getEmpName());
			}
		}

	}

	// delete employee
	public void deleteEmployee(int id) {

		try {

			for (Employee2 emp : list) {
				if (emp.getEmpId() == id) {
					list.remove(emp);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
