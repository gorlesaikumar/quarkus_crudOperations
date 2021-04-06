package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Order;


import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrderRepository1 implements PanacheRepository<Order>{

	/*
	 * public Order findByOrderId(String orderId) { return find("orderId",
	 * orderId).firstResult();
	 * 
	 * }
	 */
	

}
