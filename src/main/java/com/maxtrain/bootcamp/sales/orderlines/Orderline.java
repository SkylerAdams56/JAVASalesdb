package com.maxtrain.bootcamp.sales.orderlines;

import com.maxtrain.bootcamp.sales.item.Item;
import com.maxtrain.bootcamp.sales.order.Order;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



public class Orderline {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(columnDefinition="integer not null default 0")
	private int quantity;
	@ManyToOne(optional=false)
	@JoinColumn(name="orderId", columnDefinition="int")
	private Order order;
	@ManyToOne(optional=false)
	@JoinColumn(name="itemId", columnDefinition="int")
	private Item item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}	
	public Orderline() {}
}
