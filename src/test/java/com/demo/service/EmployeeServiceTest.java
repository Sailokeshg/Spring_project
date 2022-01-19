package com.demo.service;


import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/test-context.xml","file:src/main/webapp/WEB-INF/spring-servlet.xml"})
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeServices mockEmployeeServices;

    @Mock
    private EmployeeDao employeeDao;

    @Test
    public void addAndUpdateEmployeeTest(){
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
        mockEmployeeServices.addEmp(mockEmployee);
        mockEmployeeServices.updateEmp(mockEmployee);
        verify(employeeDao,times(1)).addEmployee(mockEmployee);
        verify(employeeDao,times(1)).updateEmp(mockEmployee);

    }

    @Test
    public void getAllEmployeesTest(){

        mockEmployeeServices.getAllEmp();
        verify(employeeDao,times(1)).getAllEmp();
    }

    @Test
    public void deleteEmployeeByIdTest(){
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
        mockEmployeeServices.deleteEmployee(mockEmployee.getId());
        verify(employeeDao,times(1)).deleteEmp(mockEmployee.getId());
    }

    @Test
    public void getEmployeeByIdTest(){
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
        mockEmployeeServices.getById(mockEmployee.getId());
        verify(employeeDao,times(1)).getEmpById(mockEmployee.getId());
        assertNotNull(mockEmployee);
    }

}
