package org.acme.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.model.Order;

import org.acme.repository.OrderRepository1;

@ApplicationScoped
public class OrderService1 {
	
	@Inject
	private OrderRepository1 orderRepository1;

	
	@Transactional
	public void createOrder(Order ord) {
		System.out.println(ord.toString());
		orderRepository1.persist(ord);
		
	}

	/*
	 * @Transactional public Order getOrder(String orderId) {
	 * 
	 * return orderRepository1.findByOrderId(orderId); }
	 */

}
