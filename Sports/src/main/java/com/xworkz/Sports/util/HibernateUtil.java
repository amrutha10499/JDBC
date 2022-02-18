package com.xworkz.Sports.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionfactory;
	
	static {
		Configuration cfg =new Configuration();
		cfg.configure();
		
		sessionfactory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionfactory;)
	}

}
