package com.demo.dao;

import java.util.List;
import java.util.Objects;


import javax.transaction.Transactional;


import com.demo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import com.demo.model.Student;

@Component
public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;


	//save student
	@Transactional
	public void saveStudent(Student student)
	{
		hibernateTemplate.save(student);
	}


	//get all Student

	public List<Student> getAllStudents()
	{
		return hibernateTemplate.loadAll(Student.class);
	}


	//get student by id

	public Student getById(Long id)
	{
		return hibernateTemplate.get(Student.class, id);
	}

	//update student
	@Transactional
	public void updateStudent(Student std)
	{
		hibernateTemplate.update(std);
	}

	//delete student
	@Transactional
	public void deleteStudent(Long id)

	{
		hibernateTemplate.delete(Objects.requireNonNull(hibernateTemplate.get(Student.class, id)));
	}

	
}



