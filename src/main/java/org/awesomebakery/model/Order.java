package org.awesomebakery.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

	private String customerId;
	private Date orderDate;
	private Date deliveryDate;
	private int[] orders;

	public Order(String customerId, Date orderDate, Date deliveryDate, int[] orders) {
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.orders = orders;
	}

	public Order() {

	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int[] getOders() {
		return orders;
	}

	public void setOders(int[] oders) {
		this.orders = oders;
	}

	@Override
	public String toString() {
		return ""+ customerId + '\'' +
				","+ orderDate +
				"," + deliveryDate +
				"," + Arrays.toString(orders);
	}
	public Order parseStringToOrderObject(List<String> orderString){
		String[] newString = orderString.get(0).split(",");
		String customerID = newString[0];
		Date dateObject = new Date(0,0);
		Date orderDate = dateObject.parseStringToDate(newString[1]);
		Date deliverDate = dateObject.parseStringToDate(newString[2]);
		String[] tmp = newString[3].split(",");
		int[] numberOfProducts = new int[tmp.length];
		for(int i = 0; i < tmp.length; i++){
			numberOfProducts[i] = Integer.parseInt(tmp[i]);
		}
		return new Order(customerID, orderDate, deliverDate, numberOfProducts);
	}
}
