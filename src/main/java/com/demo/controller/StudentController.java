package com.demo.controller;

import java.util.List;

import com.demo.converter.StudentConverter;
import com.demo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Student;
import com.demo.service.StudentServices;

@Controller
@RequestMapping
public class StudentController {

	
	@Autowired
	StudentServices studentService;
	
	@GetMapping("/studentReport")
	public String studentReport()
	{
		
		return "StudentReport";
	}

	@PostMapping("/insertStudent")
	@ResponseBody
	public String saveStudent(@ModelAttribute("insertStudent") StudentDTO studentDTO)
	{
		StudentConverter studentConverter = new StudentConverter();
		studentService.saveStudent(studentConverter.dtoToEntity(studentDTO));
		return "saved";
	}

	
	@GetMapping("/getAllStudent")
	@ResponseBody
	public  List<Student> getAllStudent()
	{
		
		return studentService.getAllStudent();
	}

	@GetMapping("/getOneStudent/{id}")
	@ResponseBody
	public Student getById(@PathVariable Long id)
	{
		return studentService.getById(id);
	}
	
	
	@PostMapping("/updateStudent")
	@ResponseBody
	public String updateStudent(@ModelAttribute("updateStudent") StudentDTO std)
	{
		StudentConverter studentConverter = new StudentConverter();
		studentService.updateStudent(studentConverter.dtoToEntity(std));
	
	return "updated";
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
		
		return "deleted";
	}
	
	
	
}
