package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;

@Component
public class EmployeeDao {

	
	@Autowired
	HibernateTemplate hibernateTemplate;


	//add employee
	@Transactional
	public void addEmployee(Employee employee)
	{
		hibernateTemplate.save(employee);
	}


	//get all employee
	public List<Employee> getAllEmp()
	{
		return hibernateTemplate.loadAll(Employee.class);
	}

	//get employee by id
	@Transactional
	public Employee getEmpById(Long id)
	{
		return hibernateTemplate.get(Employee.class, id);
	}


	//update employee

	@Transactional
	public void updateEmp(Employee employee)
	{
		hibernateTemplate.update(employee);
	}


	//delete employee
	@Transactional
	public void deleteEmp(Long id)
	{
		hibernateTemplate.delete(hibernateTemplate.load(Employee.class, id));
	}

}
