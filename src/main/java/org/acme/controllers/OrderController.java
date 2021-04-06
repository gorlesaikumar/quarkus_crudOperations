package org.acme.controllers;


import javax.inject.Inject;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.model.Orders;

import org.acme.service.OrderService;



@Path("/api/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderController {
	
	@Inject
	private OrderService orderService;

	@GET
	@Path("{orderId}")
	public Orders fetchOrder(@PathParam("orderId") String orderId) {
		return orderService.getOrder(orderId);
	}
	
	
	@POST
	@Path("createOrder")
	public Response fetchOrder(Orders order) {
		orderService.createOrder(order);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{orderId}")
	public void delete(@PathParam("orderId") String orderId) {
		orderService.delete(orderId);
	}
	
	@PUT
	@Path("update")
	public void edit(Orders order)
	{
		
		orderService.update(order);
		
		
	}
		
		 
	     
		
	

	

}
