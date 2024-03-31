package com.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.student;

import jakarta.transaction.Transactional;

public class studentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Transactional
	public   int insert(student student) {

		Integer res = (Integer) hibernateTemplate.save(student);
		return res;

	}

	public studentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public studentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
}
