package com.edureka.spring.jdbc.intro.dao.impl;

import com.edureka.spring.jdbc.intro.bean.Book;
import com.edureka.spring.jdbc.intro.dao.BookDAO;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class BookDAOImpl implements BookDAO {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
    	this.hibernateTemplate=hibernateTemplate;
	}

	@Override
	public void saveBook(Book book) {
		hibernateTemplate.save(book) ;	
		System.out.println("Book Added successfully");
	}

	@Override
	public void modifyBook(Book book) {
		hibernateTemplate.update(book) ;	
		System.out.println("Book Updated successfully");
	}

	@Override
	public void removeBook(Book book) {
		hibernateTemplate.delete(book) ;	
		System.out.println("Book Removed successfully");
	}

}
