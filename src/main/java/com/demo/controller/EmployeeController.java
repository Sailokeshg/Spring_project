package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Employee;
import com.demo.service.EmployeeServices;

@Controller
@RequestMapping
public class EmployeeController {

	String employeeReport = "redirect:/employeeReport";

	@Autowired
	EmployeeServices employeeServices;
	
	//lode add employee form
	@GetMapping("/addEmployee")
	public String  addEmp()
	{
		
		return "AddEmployee";
		
	}
	
	
	//save employee form
	@PostMapping("/insertEmployee")
	public String insertEmployee(@ModelAttribute("insertEmployee") Employee employee)
	{
		
		employeeServices.addEmp(employee);
		return employeeReport;
	}
	
	
	
	//lode employee data
	@GetMapping("/employeeReport")
	public String loadEmployee(Model theModel)
	{
		theModel.addAttribute("employee", employeeServices.getAllEmp());
		theModel.addAttribute("title", "Employee Report");
		
		return "EmployeeReport";
	}

	//lode edit form
	@GetMapping("/editEmployee/{id}")
	public String loadEditForm(@PathVariable(value="id") Long id, Model theModel)
	{
		Employee employee=employeeServices.getById(id);
		
		System.out.println(employee);
		theModel.addAttribute("employee", employee);
		theModel.addAttribute("title", "Edit Employee");
		
		return "EditEmployee";
	}

	@PostMapping("/editEmployee/updateEmployee")
	public String updateEmp(@ModelAttribute("updateEmployee") Employee employee)
	{
		employeeServices.updateEmp(employee);
		
		return employeeReport;
		
	}
	

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id)
	{
		employeeServices.deleteEmployee(id);

		return employeeReport;
	}

	
}
