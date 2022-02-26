package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtility {

	private static SessionFactory sf;

	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public static Session getSession() {

		Session session = sf.openSession();
		return session;
	}

}