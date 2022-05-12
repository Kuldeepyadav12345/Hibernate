package com.training.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.training.model.HibernateEmployee;

public class HibernateUtil {
	private static SessionFactory factory;

	// this will return the session factory object
	public static Session getSession() {
		return factory.openSession();
	}

	// this will close the factory object
	public static void closeSessionFactory() {
		factory.close();
	}

	static {// we used static block to initialize the factory
		Configuration configuation = new Configuration().configure().addAnnotatedClass(HibernateEmployee.class); // will read all
		// the properties from config file
		// we also have to provide for whcih class it has to create table or which class
		// has @Entity annotiation we do
		// it by addAnnotatedClass(Emoloyee.class) method
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuation.getProperties());
		// this will apply the configuration
		factory = configuation.buildSessionFactory(builder.build());
		// this will create a session factory object into factory
	}

}
