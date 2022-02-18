package com.xworkz.Sports.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Sports.dto.SportsDTO;
import com.xworkz.Sports.util.HibernateUtil;

public class SportsDAOImpl implements SportsDAO {

	public void saveAllDEtails(SportsDTO dto) {

		Session session = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure();

			// step2
			SessionFactory sessionFactory = cfg.buildSessionFactory();

			// step3
			session = sessionFactory.openSession();

			// step4
			Transaction transaction = session.beginTransaction();

			// step5
			session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session != null)
			session.close();
		}
		
	}

public SportsDTO getSportsBYId(int Id) {
	Session session=null;
	SportsDTO  dto=null;
	
	try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		session=factory.openSession();
		
		Transaction transaction =session.beginTransaction();
		
		dto=session.get(SportsDTO.class,SportsId);
		
		transaction.commit();
		
	}
	catch(Exception e) {
	}
	finally {
		if(session!=null)
			session.close();
	}
}

public void updatetypeById(String type,int id) {
	Session session =null;
	SportsDTO sportsDTO=null;
	Transaction tx=null;
	try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		session=factory.openSession();
		tx=session.beginTransaction();
		
		sportsDTO=session.get(SportsDTO.class, id);
		if(sportsDTO!=null) {
			System.out.println(sportsDTO);
			sportsDTO.setType(type);
			session.update(sportsDTO);
			tx.commit();
		}
		
	}
	catch(HibernateException e) {
		e.printStackTrace();
		tx.rollback();
	}
	finally {
		if(session != null)
			session.close();
		
	}
	}

public void deletebyname(String name) {
	Session session =null;
	SportsDTO sportsDTO=null;
	Transaction tx=null;
	try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		session=factory.openSession();
		tx=session.beginTransaction();
		
		sportsDTO=session.get(SportsDTO.class,name);
		if(sportsDTO!=null) {
			System.out.println(sportsDTO);
			
			session.delete(sportsDTO);
			tx.commit();
		}
		
	}
	catch(HibernateException e) {
		e.printStackTrace();
		tx.rollback();
	}
	finally {
		if(session != null)
			session.close();
		
	}
	}
}
