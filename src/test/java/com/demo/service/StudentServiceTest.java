package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/test-context.xml","file:src/main/webapp/WEB-INF/spring-servlet.xml"})
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    private StudentServices mockStudentServices;

    @Mock
    private StudentDao studentDao;

    @Test
    public void updateAndSaveStudentTest(){
        Student mockStudent = new Student(10L,"tester","23","java");
        mockStudentServices.updateStudent(mockStudent);
        mockStudentServices.saveStudent(mockStudent);
        verify(studentDao,times(1)).updateStudent(mockStudent);
        verify(studentDao,times(1)).saveStudent(mockStudent);
    }

    @Test
    public void getAllStudentsTest(){
        mockStudentServices.getAllStudent();
        verify(studentDao,times(1)).getAllStudents();
    }

    @Test
    public void getStudentByIdTest(){
        Student mockStudent = new Student(10L,"tester","23","java");;
        mockStudentServices.getById(mockStudent.getId());
        verify(studentDao,times(1)).getById(mockStudent.getId());
    }

    @Test
    public void deleteStudentByIdTest(){
        Student mockStudent = new Student(10L,"tester","23","java");
        mockStudentServices.deleteStudent(mockStudent.getId());
        verify(studentDao,times(1)).deleteStudent(mockStudent.getId());
    }

}
