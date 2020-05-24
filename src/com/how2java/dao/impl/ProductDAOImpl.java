package com.how2java.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("productDAO")
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO{

	@Resource(name="sf")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	};
	
	public List<Product> list() {
		return find("from Product");
	}

	@Override
	public void add(Product p) {
		save(p);
	}
	
}
