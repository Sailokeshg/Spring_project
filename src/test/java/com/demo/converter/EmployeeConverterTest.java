package com.demo.converter;

import com.demo.dto.EmployeeDTO;
import com.demo.model.Employee;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;

public class EmployeeConverterTest {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertEmployeeEntityToDto_isEqual(){
        Employee employee = new Employee();
        employee.setId(10L);
        employee.setName("tester");
        employee.setDepartment("DevOps");
        employee.setAddress("Hyderabad");
        employee.setDesignation("Mr");

        EmployeeDTO employeeDTO =modelMapper.map(employee,EmployeeDTO.class);
        assertEquals(employee.getId(),employeeDTO.getId());
        assertEquals(employee.getName(),employeeDTO.getName());
        assertEquals(employee.getAddress(),employeeDTO.getAddress());
        assertEquals(employee.getDepartment(),employeeDTO.getDepartment());
        assertEquals(employee.getDesignation(),employeeDTO.getDesignation());
    }

    @Test
    public void whenConvertEmployeeDtoToEntity_isEqual(){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(10L);
        employeeDTO.setSalary(25000.00);
        employeeDTO.setAddress("Hyderabad");
        employeeDTO.setName("Tester");
        employeeDTO.setDesignation("Mr");

        Employee employee = modelMapper.map(employeeDTO,Employee.class);
        assertEquals(employeeDTO.getId(),employee.getId());
        assertEquals(employeeDTO.getName(),employee.getName());
        assertEquals(employeeDTO.getSalary(),employee.getSalary());
        assertEquals(employeeDTO.getAddress(),employee.getAddress());
        assertEquals(employeeDTO.getDesignation(),employee.getDesignation());

    }
}
