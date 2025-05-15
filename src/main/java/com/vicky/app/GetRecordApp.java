package com.vicky.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vicky.model.Student;

public class GetRecordApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session1 = null;
		Session session2 = null;
		
		try {
			
			session1 = sessionFactory.openSession();
			session2 = sessionFactory.openSession();
			
			Student student1 = session1.get(Student.class, 1);
			System.out.println(student1);
			
			Student student2 = session2.get(Student.class, 2);
			System.out.println(student2);
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session1.close();
			session2.close();
			sessionFactory.close();
		}
		
		
	}

}
