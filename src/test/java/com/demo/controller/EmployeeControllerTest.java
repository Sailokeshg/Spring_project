package com.demo.controller;

import com.demo.dto.EmployeeDTO;
import com.demo.model.Employee;
import com.demo.service.EmployeeServices;
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
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.*;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/test-context.xml","file:src/main/webapp/WEB-INF/spring-servlet.xml"})
@WebAppConfiguration
public class EmployeeControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private EmployeeServices employeeServicesMock;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp(){
        Mockito.reset(employeeServicesMock);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void shouldReturnListOfEmployees() throws Exception{
        when(employeeServicesMock.getAllEmp())
                .thenReturn(List.of(new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr")));

        mockMvc.perform(get("/employeeReport"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("EmployeeReport"));
    }

    @Test
    public void shouldGetEmployeeForEditingById() throws Exception{
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
        when(employeeServicesMock.getById(mockEmployee.getId()))
                .thenReturn(mockEmployee);

        mockMvc.perform(get("/editEmployee/{id}",mockEmployee.getId()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("EditEmployee"));
    }

    @Test
    public void shouldDeleteEmployeeById() throws Exception {

        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");

        mockMvc.perform(get("/deleteEmployee/{id}",mockEmployee.getId()))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/employeeReport"));
        verify(employeeServicesMock,times(1)).deleteEmployee(mockEmployee.getId());

    }

    @Test
    public void shouldAddEmployee() throws Exception{
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
         mockMvc.perform(get("/addEmployee"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name("AddEmployee"));

    }

    @Test
    public void shouldInsertAndUpdate() throws Exception {
        EmployeeDTO mockEmployeeDto = new EmployeeDTO(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");

        mockMvc.perform(post("/editEmployee/updateEmployee").flashAttr("updateEmployee",mockEmployeeDto))
                        .andExpect(MockMvcResultMatchers.status().is(302));
        mockMvc.perform(post("/insertEmployee").flashAttr("insertEmployee",mockEmployeeDto));

    }




}
