package com.edureka.spring.jdbc.intro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.edureka.spring.intro.model.Course;
import com.edureka.spring.jdbc.intro.dao.CourseDAO;

public class CourseDAOImpl implements CourseDAO{
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insertCourse(Course course) {

		String query = "insert into course (id,title,price) values (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, course.getCourseId());
			ps.setString(2, course.getCourseTitle());
			ps.setInt(3, course.getPrice());
			int out = ps.executeUpdate();
			if (out != 0) {
				System.out.println("Course Added   ");
			} else
				System.out.println("Error inserting Course");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
