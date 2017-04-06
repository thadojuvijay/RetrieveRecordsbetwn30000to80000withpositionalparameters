package com.ecil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility 
{
	
	
	private static SessionFactory sessionFactory;

	
	static
{
	Configuration configuration=new Configuration();
	configuration.configure();
sessionFactory = configuration.buildSessionFactory();

	
}


public static SessionFactory sessionFactory()
{
	return sessionFactory;
}

public static Session getSession()
{
	Session session = sessionFactory.openSession();
	return session;
}

private HibernateUtility()
{
	
}
}
