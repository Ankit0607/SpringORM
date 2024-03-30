package com.springorm.dao;

import java.io.Serializable;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.student;

public class studentDao {

	HibernateTemplate hibernateTemplate;
	
	public int insert(student student) {
		
		Integer res = (Integer) this.hibernateTemplate.save(student);
		return res;
		
	}
}
