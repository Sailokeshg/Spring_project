package com.demo.service;


import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
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
        try {
            mockEmployeeServices.deleteEmployee(mockEmployee.getId());
        }
        catch (NullPointerException exception)
        {
            assertEquals("No such employee with id-"+mockEmployee.getId(),exception.getMessage());
        }
        verify(employeeDao,times(1)).deleteEmp(mockEmployee.getId());
    }

    @Test
    public void getStudentByIdTest(){
        Employee mockEmployee = new Employee(10L,"tester","DevOps","Hyderabad",2000.00,"Mr");
        Long id = mockEmployee.getId();
        try {
            mockEmployeeServices.getById(mockEmployee.getId());
        }
        catch (NullPointerException exception){
            assertEquals("Owner Id is not found "+id, exception.getMessage());
        }
        verify(employeeDao,times(1)).getEmpById(mockEmployee.getId());

    }

}
