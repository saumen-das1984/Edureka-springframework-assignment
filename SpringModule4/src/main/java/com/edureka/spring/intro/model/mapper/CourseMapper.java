package com.edureka.spring.intro.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edureka.spring.jdbc.intro.bean.Course;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course = new Course();
		course.setCourseId(rs.getString("id"));
		course.setCourseTitle(rs.getString("title"));
		course.setPrice(rs.getInt("price"));
		return course;
	}

}
