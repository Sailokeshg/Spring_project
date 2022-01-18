package com.demo.converter;

import com.demo.dto.EmployeeDTO;
import com.demo.dto.StudentDTO;
import com.demo.model.Employee;
import com.demo.model.Student;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;

public class StudentConverterTest {
    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertStudentEntityToDto_isEqual(){
        Student student = new Student();
        student.setId(10L);
        student.setName("tester");
        student.setCourse("java");

        StudentDTO studentDTO =modelMapper.map(student,StudentDTO.class);
        assertEquals(student.getId(),studentDTO.getId());
        assertEquals(student.getName(),studentDTO.getName());
        assertEquals(student.getCourse(),studentDTO.getCourse());


    }

    @Test
    public void whenConvertStudentDtoToEntity_isEqual(){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(10L);
        studentDTO.setName("Tester");
        studentDTO.setCourse("Java");

        Student student = modelMapper.map(studentDTO,Student.class);
        assertEquals(studentDTO.getId(),student.getId());
        assertEquals(studentDTO.getName(),student.getName());
        assertEquals(studentDTO.getCourse(),student.getCourse());


    }
}
