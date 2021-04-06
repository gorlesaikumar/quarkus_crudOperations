package org.acme.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import javax.transaction.Transactional;



import org.acme.model.Orders;
import org.acme.repository.OrderRepository;


@ApplicationScoped
public class OrderService {
	
	@Inject
	private OrderRepository orderRepository;

	@Transactional
	public Orders getOrder(String orderId) {

		return orderRepository.findByOrderId(orderId);
	}
	
	

	@Transactional
	public void createOrder(Orders order) {

		orderRepository.persist(order);
	}
    

	@Transactional
	public void delete(String orderId) {

		 orderRepository.deleteOrderById(orderId);
	}


    @Transactional
	public void update(Orders order) {
		
    	  Orders od=orderRepository.findByOrderId(order.getOrderId());
    
		  od.setCity(order.getCity());
		  od.setCost(order.getCost());
		  od.setCustomerName(order.getCustomerName());
		  od.setItemId(order.getItemId());
		  od.setQuantity(order.getQuantity());
		  
		  orderRepository.updateOrder(od);
	
		
	}



}
