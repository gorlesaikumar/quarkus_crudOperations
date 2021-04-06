package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Orders;

import io.quarkus.hibernate.orm.panache.PanacheRepository;



@ApplicationScoped
public class OrderRepository implements PanacheRepository<Orders>
{

	public Orders findByOrderId(String orderId) {
		
		return find("orderId", orderId).firstResult();
	}
	
	public long deleteOrderById(String orderId) {
		
		return delete("orderId", orderId);
	}

	public void updateOrder(Orders order) {
		
		persist(order);
		
	}

	

	

	




	


	

	

	

	

	

	

	
	
  
     

        
}
