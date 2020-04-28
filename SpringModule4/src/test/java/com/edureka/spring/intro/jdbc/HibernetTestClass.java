package com.edureka.spring.intro.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.jdbc.intro.bean.Book;
import com.edureka.spring.jdbc.intro.dao.impl.BookDAOImpl;

public class HibernetTestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextMYSQLJDBCHibernet.xml");
		BookDAOImpl bookDAOImpl=(BookDAOImpl)context.getBean("bookDAOImpl");	
		Book book=new Book(23145,"Neo4j Database",17999);
		Book bookNew=new Book(23145,"Neo4j Database",10000);
		bookDAOImpl.saveBook(book);
		
		bookDAOImpl.modifyBook(bookNew);
	}
	
}
