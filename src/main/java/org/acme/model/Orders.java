package org.acme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "orderstest")
@Entity
public class Orders {
	@Id
	private String orderId;
	private String customerName;
	private String city;
	private String itemId;
	@Column(name = "itemCost")
	private int cost;
	private int quantity;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerName=" + customerName + ", city=" + city + ", itemId=" + itemId
				+ ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	
	

}
