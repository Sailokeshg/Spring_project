package com.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;


	@Size(min = 1,message = "name is required")
	private String name;

	private String age;

	@Size(min = 1,message = "course is required")
	private String course;


}
