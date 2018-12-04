package com.entities;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Main {
 
   /* public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
         
        Session session = sessionFactory.openSession();
        session.beginTransaction();
         
        Category category = new Category("Computer");
         
        Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
         
        Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
         
        Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
         
        Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
         
        Set<Product> products = new HashSet<Product>();
        products.add(pc);
        products.add(laptop);
        products.add(phone);
        products.add(tablet);
         
        category.setProducts(products);
         
        session.save(category);
         Category category = (Category) session.get(Category.class, new Long(1));
         session.delete(category);
        session.getTransaction().commit();
        session.close();       
    }*/
	
	 public static void main(String[] args) {
	        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	        SessionFactory sessionFactory = configuration.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	       /* Category2 category = new Category2("Computer");
	        Product2 pc = new Product2("DELL PC", "Quad-core PC", 1200, category.getId()+"");
	        Product2 laptop = new Product2("MacBook", "Apple High-end laptop", 2100, category.getId()+"");
	        Set<Product2> products = new HashSet<Product2>();
	        products.add(pc);
	        products.add(laptop);
	        category.setProducts(products);
	        session.save(category);*/
	        Category2 category = (Category2) session.get(Category2.class, new Long(2));
	        session.delete(category);
	        session.getTransaction().commit();
	        session.close();       
	    }
}
