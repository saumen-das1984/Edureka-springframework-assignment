package com.edureka.spring.intro.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.jdbc.intro.bean.Stock;
import com.edureka.spring.jdbc.intro.dao.impl.StockDAOImpl;

public class JDBCTestClass2 {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextMYSQLJDBCBatchTemplate.xml");
		StockDAOImpl stockDAOImpl=(StockDAOImpl)context.getBean("stockDAOImpl");	
		List <Stock> stockList=new ArrayList<Stock>();
		for(int i=0;i<2000;i++){
			Stock obj=new Stock("Assassin Creed","Games",i+1);
			stockList.add(obj);
		}
		stockDAOImpl.insertStock(stockList);
	}

}
