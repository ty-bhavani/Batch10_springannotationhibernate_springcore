package com.te.hibernatedemo.bean;

import javax.persistence.EntityManager;

public class EnitityManagerr {

private EntityManager entityManager;

/**
 * @return the entityManager
 */
public EntityManager getEntityManager() {
	return entityManager;
}

/**
 * @param entityManager the entityManager to set
 */
public void setEntityManager(EntityManager entityManager) {
	this.entityManager = entityManager;
}

}

