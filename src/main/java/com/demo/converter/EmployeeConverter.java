package com.demo.converter;

import com.demo.dto.EmployeeDTO;
import com.demo.model.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeConverter {
    public EmployeeDTO entityToDto(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setDesignation(employee.getDesignation());
        employeeDTO.setName(employee.getName());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setAddress(employee.getAddress());
        return employeeDTO;
    }

    public Employee dtoToEntity(EmployeeDTO employeeDTO){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(employeeDTO,Employee.class);
    }
}
