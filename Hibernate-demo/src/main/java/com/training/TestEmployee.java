package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.HibernateEmployee;
import com.training.util.HibernateUtil;

public class TestEmployee {

	public static void main(String[] args) {
		HibernateEmployee kuldeep =new HibernateEmployee(101, "Kuldeep Yadav", "IT", 90000);
		HibernateEmployee suraj =new HibernateEmployee(102, "Suraj Anasune", "IT", 80000);
		HibernateEmployee onkar =new HibernateEmployee(103, "Onkar Rane", "IT", 70000);
		HibernateEmployee ajeet =new HibernateEmployee(104, "Ajeet Singh", "IT", 60000);
		HibernateEmployee vishal =new HibernateEmployee(105, "Vishal Mewati", "IT", 50000);
		HibernateEmployee angle =new HibernateEmployee(106, "Angle priya", "HR", 500000);
		HibernateEmployee sachin =new HibernateEmployee(107, "Sachin chawan", "Testing", 40000);
		HibernateEmployee shreya =new HibernateEmployee(108, "Shreya Mewati", "HR", 100000);
		
//		Session session =HibernateUtil.getSession();
//		
//		Transaction tx=session.beginTransaction();
//		int id=(Integer) session.save(kuldeep);
//		session.persist(suraj);
//		session.persist(onkar);
//		tx.commit();
		saveEmployees(kuldeep);
		saveEmployees(suraj);
		saveEmployees(onkar);
		HibernateUtil.closeSessionFactory();
	}
	
	
	public static void saveEmployees(HibernateEmployee employee)
	{
	Session session =HibernateUtil.getSession();
	Transaction tx=session.beginTransaction();
	session.persist(employee);
	tx.commit();
	session.close();
		
	}
}
