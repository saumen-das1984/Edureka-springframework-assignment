package com.edureka.spring.jsf.intro.bean;

import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;

import com.edureka.spring.jsf.intro.user.inf.Student;

@Named
@Scope("session")
public class ClassBean {

	@Inject
	Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public String printStudent() {
		return student.getMessage();
	}

}