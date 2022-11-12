package com.gl.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.test.Teacher;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test the conenction
//		String jdbcurl = "jdbc:mysql://localhost:3306/hibernate_demos?useSSL=false";
//		String user  = "root";
//		String pass = "root";
//		
//		try {
//			System.out.println("connection"+jdbcurl);
//			
//			Connection muconnection = DriverManager.getConnection(jdbcurl, user, pass);
//			
//			System.out.println("Connection successfull");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Connecting to database");
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("connected to database...");
		
		Session session = null;
		
		Teacher t1 = new Teacher("Allam", "Reddy");
		Teacher t2 = new Teacher("old", "New");
		
		Transaction tx = null;
		List<Teacher> teacherList = null;
		System.out.println("Connected to database successfully");
		try{
			
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
//			1. Create 
			session.save(t2); //insert
			
//			2. Read
//			Teacher teacher = session.get(Teacher.class, 2); // get single record
//			teacherList= session.createQuery("from Teacher").list(); // get multiple records
			//list() is depricated. use getResultLis()
			
//			3. Update
			// update one record in the table
//			Teacher teacher = session.get(Teacher.class, 2);
//			teacher.setF_name("Sushanth");
//			session.update(teacher);
			
//			update multiple records at a time. 
//			Make sure table name in the query matches the Class name.(case sensitive) Hibernate Query Language
//			session.createQuery("update Teacher set l_name = 'choudary' where f_name = 'old' ").executeUpdate();
			
//			4. Delete
//			Teacher teacher = session.get(Teacher.class, 3); // get single record
//			session.delete(teacher); // delete single record
			
//			session.createQuery("delete from Teacher where id=2").executeUpdate();
			
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			factory.close();
		}
		
//		for(Teacher t: teacherList) {
//			System.out.println(t);
//		}
		System.out.println("Session completed successfully");
	}

}
