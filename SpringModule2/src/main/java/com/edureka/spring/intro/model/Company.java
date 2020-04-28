package com.edureka.spring.intro.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Company {
	private String name;
	private String location;

}
