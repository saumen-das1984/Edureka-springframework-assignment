package com.edureka.spring.jdbc.intro.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;

import org.springframework.beans.factory.annotation.Autowired;

import com.edureka.spring.intro.model.mapper.CourseMapper;
import com.edureka.spring.jdbc.intro.bean.Course;
import com.edureka.spring.jdbc.intro.dao.CourseDAO;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
    	this.hibernateTemplate=hibernateTemplate;
	}

	@Override
	public Boolean insertCourse(final Course course) {
		String insq = "insert into course (id,title,price) values (?,?,?)";
		return jdbcTemplate.execute(insq, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) {
				try {
					ps.setString(1, course.getCourseId());
					ps.setString(2, course.getCourseTitle());
					ps.setInt(3, course.getPrice());
					ps.execute();
					return true;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		});
	}

	@Override
	public Boolean deleteCourse(Course course) {
		try {
			String sql = "delete from course where title=? ";
			jdbcTemplate.update(sql, new Object[] { course.getCourseTitle() });
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Course> findByCourseTitle(final String courseTitle) {
		String SQL = "select * from course where title=?";
		List<Course> courseList = jdbcTemplate.query(SQL, new PreparedStatementSetter() {

			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, courseTitle);
			}
		}, new CourseMapper());
		return courseList;
	}

	@Override
	public Boolean updateCourse(String newCourseName, Course course) {
		try {
			Object params[] = { newCourseName, course.getCourseId(), course.getPrice(), course.getCourseTitle() };
			String sql = "update course set title=?, id=? ,price=? where title=?";
			jdbcTemplate.update(sql, params);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
