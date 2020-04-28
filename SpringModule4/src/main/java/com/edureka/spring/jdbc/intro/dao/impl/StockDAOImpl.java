package com.edureka.spring.jdbc.intro.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;


import org.springframework.beans.factory.annotation.Autowired;

import com.edureka.spring.jdbc.intro.bean.Stock;
import com.edureka.spring.jdbc.intro.dao.StockDAO;

public class StockDAOImpl implements StockDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private int insertBatchSize=2000;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void insertStock(List<Stock> stockList) {
		 String sql = "INSERT INTO stock (name, category, number) VALUES (?, ?, ?)";
		try {
			int[][] updateCounts = jdbcTemplate.batchUpdate(sql,
					stockList, insertBatchSize,
					new ParameterizedPreparedStatementSetter<Stock>() {
						public void setValues(PreparedStatement ps, Stock stock)
								throws SQLException {
							ps.setString(1, stock.getName());
							ps.setString(2, stock.getCategory());
							ps.setInt(3, stock.getNumber());
						}
					});
			System.out.println("Data inserted in Stock --------------- :: " + updateCounts.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
