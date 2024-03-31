package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.studentDao;
import com.springorm.entities.student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
		
//		studentDao dao = context.getBean("studentDao", studentDao.class);
//		student student = new student(101, "Radha", "Barsana");
//		int insert = studentDao.insert(student);
//		System.out.println("Number of row inserted : " + insert);

	}
}
