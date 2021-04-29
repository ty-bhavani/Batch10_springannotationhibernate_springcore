package com.te.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.hibernatedemo.bean.EnitityManagerr;
import com.te.hibernatedemo.bean.School;
import com.te.hibernatedemo.config.EnitityManagerConfig;

public class HibernateTest {

	public static void main(String[] args) {
		 School school = new School();
		 school.setSid(836435);
		 school.setSname("S.D.V.S");
		ApplicationContext context = new AnnotationConfigApplicationContext(EnitityManagerConfig.class);
               EnitityManagerr managerr= context.getBean( EnitityManagerr.class);
               EntityManager entityManager=managerr.getEntityManager();
               EntityTransaction entityTransaction=entityManager.getTransaction();
               entityTransaction.begin();
               entityManager.persist(school);
               entityTransaction.commit();
               System.out.println("Record inserted succesfully");
	}

}

