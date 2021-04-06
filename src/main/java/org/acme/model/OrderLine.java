package org.acme.model;






import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "orderLinetable")
@Entity
public class OrderLine {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long itemId;
	private String itemName;
	private int itemCost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;
	
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	
	@Override
	public String toString() {
		return "OrderLine [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", order=" + order
				+ "]";
	}
	
	
	
	
}
