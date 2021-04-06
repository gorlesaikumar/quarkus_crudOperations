package org.acme.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "ordertable")
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long orderId;
	
	private boolean paymentStatus;
	private int amount;
	
	@OneToMany(mappedBy = "order",cascade  = {CascadeType.ALL})
	private Set<OrderLine> orderline;
	
	public Set<OrderLine> getOrderline() {
		return orderline;
	}
	public void setOrderline(Set<OrderLine> orderline) {
		this.orderline = orderline;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", paymentStatus=" + paymentStatus + ", amount=" + amount + ", orderline="
				+ orderline + "]";
	}
	
}
