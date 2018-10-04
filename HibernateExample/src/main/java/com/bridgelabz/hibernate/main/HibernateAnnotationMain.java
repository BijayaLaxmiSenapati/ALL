package com.bridgelabz.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.bridgelabz.hibernate.models.Employee;
import com.bridgelabz.hibernate.utils.HibernateUtil;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("Bijaya Laxmi Senapati");
		emp.setRole("CEO");
		emp.setInsertTime(new Date());
		
		Session session=HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		
		session.beginTransaction();
	
		session.save(emp);
		
		session.getTransaction().commit();
		
		System.out.println("id="+emp.getId());
		
		HibernateUtil.getSessionAnnotationFactory().close();
	}
}
