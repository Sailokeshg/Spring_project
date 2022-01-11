package com.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    EmployeeDTO employeeDTO;

    private Long id;
    private String name;
    private String department;
    private String address;
    private Double salary;
    private String designation;

}
