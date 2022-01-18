package com.demo.controller;

import com.demo.dto.StudentDTO;
import com.demo.model.Student;
import com.demo.service.StudentServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/test-context.xml","file:src/main/webapp/WEB-INF/spring-servlet.xml"})
@WebAppConfiguration
public class StudentControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private StudentServices studentServicesMock;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp(){
        Mockito.reset(studentServicesMock);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void shouldReturnListOfStudents() throws Exception{
        when(studentServicesMock.getAllStudent())
                .thenReturn(List.of(new Student(10L,"tester","23","java")));

        mockMvc.perform(get("/getAllStudent"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void shouldGetStudentReport() throws Exception {

        mockMvc.perform(get("/studentReport"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("StudentReport"));
    }

    @Test
    public void shouldGetStudentById() throws Exception{
        Student mockStudent = new Student(10L,"tester","23","java");
        mockMvc.perform(get("/getOneStudent/{id}",mockStudent.getId()));
        verify(studentServicesMock,times(1)).getById(mockStudent.getId());

    }

    @Test
    public void shouldDeleteStudentById() throws Exception {
        Student mockStudent = new Student(10L,"tester","23","java");

        mockMvc.perform(get("/deleteStudent/{id}",mockStudent.getId()));
        verify(studentServicesMock,times(1)).deleteStudent(mockStudent.getId());
    }

    @Test
    public void shouldSaveStudent() throws Exception{
        StudentDTO studentDTO = new StudentDTO(10L,"tester","23","java");
        mockMvc.perform(post("/updateStudent").flashAttr("updateStudent",studentDTO))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }


    @Test
    public void shouldInsertStudent() throws Exception{
        StudentDTO studentDTO = new StudentDTO(10L,"tester","23","java");

        mockMvc.perform(post("/insertStudent").flashAttr("insertStudent",studentDTO))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }






}



