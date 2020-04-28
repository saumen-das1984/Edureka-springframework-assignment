package com.edureka.spring.intro.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	String name;
	String id;
	Hostel hostel;
}
