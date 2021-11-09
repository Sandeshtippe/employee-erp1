package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Service.EmployeeService;
import com.employee.model.Employee2;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// GET
	@GetMapping("/employeelist")
	public List<Employee2> getEmployee2() {

		return employeeService.getAllEmployee();
	}

	@GetMapping("{id}")
	public Employee2 getEmployee2ById(@PathVariable int id) {
		return employeeService.getEmploye2(id);

	}

//	@RequestMapping(value = "/save", method = RequestMethod.POST  )
//	public void saveEmployee(@RequestBody Employee2 employee) {
//		employeeService.saveEmployee(employee);
//	}

	@PostMapping("/save")
	public void saveEmployee(@RequestBody Employee2 employee) {
		System.out.println("saveeeeeee");
		employeeService.saveEmployee(employee);
	}

	@PutMapping("/update")
	public void updateEmployee(@RequestBody Employee2 employee) {
		employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}

}
