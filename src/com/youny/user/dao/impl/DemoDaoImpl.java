package com.youny.user.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.youny.user.bo.DemoUser;
import com.youny.user.dao.DemoDao;

@Repository("demoDao")
public class DemoDaoImpl  extends HibernateDaoSupport implements DemoDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@PostConstruct
	public void injectSessionFactory() {
		super.setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DemoUser> getUserList() {
	   SQLQuery query =  sessionFactory.getCurrentSession().createSQLQuery("select * from  T_AUTH_USERINFO");
		return query.list();
	}

}
