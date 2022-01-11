package com.demo.converter;

import com.demo.dto.StudentDTO;
import com.demo.model.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentConverter {
    public StudentDTO entityToDto(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setAge(student.getAge());
        studentDTO.setCourse(student.getCourse());
        return studentDTO;
    }
    public List<StudentDTO> entityToDto(List<Student> students){
        List<StudentDTO> studentsDTO = new ArrayList<>();
        for(Student student:students){
            StudentDTO studentDTO = entityToDto(student);
            studentsDTO.add(studentDTO);
        }
        return studentsDTO;
    }
    public Student dtoToEntity(StudentDTO studentDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(studentDTO,Student.class);
    }
}
