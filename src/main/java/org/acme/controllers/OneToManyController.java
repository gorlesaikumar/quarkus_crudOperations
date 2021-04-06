package org.acme.controllers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.acme.model.Order;

import org.acme.service.OrderService1;

@Path("/api/order")
public class OneToManyController {
    
	@Inject
	private OrderService1 orderService1;
	
	@POST
	@Path("createOrder")
	public Response fetchOrder(Order ord) {
		orderService1.createOrder(ord);
		System.out.println(ord.toString());
		return Response.ok().build();
	}

	/*
	 * @GET
	 * 
	 * @Path("{orderid}") public Order fetchOrder(@PathParam("orderId") String
	 * orderId) { return orderService1.getOrder(orderId); }
	 */
}
