package com.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	@NotNull(message = "name is required")
	@Size(min = 1,message = "is required")
	private String name;

	@Column(name = "department")
	private String department;

	@Column(name = "address")
	private String address;

	@Column(name = "salary")
	@NotNull(message = "salary is required")
	private Double salary;

	private String designation;



}
