package com.levitsof.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.levitsof.hibernate.dao.LevitsofSession;
import com.levitsof.hibernate.model.Course;
import com.levitsof.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		LevitsofSession levitsofSession = new LevitsofSession();

		Session session = levitsofSession.getSession();

		// Teacher teacher = new Teacher("Jerson gomez");
		Course course = new Course("Lenguaje de programacion");
		session.beginTransaction();
		// session.save(teacher);
		session.save(course);
		session.getTransaction().commit();

	}
}
