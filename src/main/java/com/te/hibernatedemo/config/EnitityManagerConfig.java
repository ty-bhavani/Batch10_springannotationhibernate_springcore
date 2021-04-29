package com.te.hibernatedemo.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.hibernatedemo.bean.EnitityManagerr;

@Configuration
public class EnitityManagerConfig {
	
	   @Bean
		public EnitityManagerr getEntityManagerr() {
	    	EnitityManagerr entityManagerr= new EnitityManagerr();
			 entityManagerr.setEntityManager(Persistence.createEntityManagerFactory("spring").createEntityManager());;
			return entityManagerr;
		}
	}

