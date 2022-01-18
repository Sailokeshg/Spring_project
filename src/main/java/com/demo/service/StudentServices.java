package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Component
@Service
public class StudentServices {

	
	@Autowired
	StudentDao studentDao;
	
	
	//save student
	public void saveStudent(Student std)
	{
		studentDao.saveStudent(std);
	}
	
	
	//getallstudet
	public List<Student> getAllStudent()
	{
		return studentDao.getAllStudents();
	}
	
	
	//get by id 
	
	public Student getById(Long id)
	{
		Student student = studentDao.getById(id);
		if(student==null){
			throw new NullPointerException("Student Id is not found -" +id);
		}
		return student;
	}
	
	//update student
	
	public void updateStudent(Student student)
	{
		studentDao.updateStudent(student);
	}
	//delete Student
	
	public void deleteStudent(Long id)
	{
		if(id==null){
			throw new NullPointerException("No such student with id-"+id);
		}
		studentDao.deleteStudent(id);
	}
	
}
