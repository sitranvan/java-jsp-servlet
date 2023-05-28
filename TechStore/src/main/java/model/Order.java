package model;

import java.sql.Date;

public class Order {
	private String orderId;
	private Customer customer;
	private String billingAddress;
	private String shippingAddress;
	private String orderStatus;
	private String paymentMethob;
	private String paymentStatus;
	private double amountPaid;
	private Date orderDate;
	private Date deliveryDate;

	public Order() {
		super();
	}

	public Order(String orderId, Customer customer, String billingAddress, String shippingAddress, String orderStatus,
			String paymentMethob, String paymentStatus, double amountPaid, Date orderDate, Date deliveryDate) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.orderStatus = orderStatus;
		this.paymentMethob = paymentMethob;
		this.paymentStatus = paymentStatus;
		this.amountPaid = amountPaid;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentMethob() {
		return paymentMethob;
	}

	public void setPaymentMethob(String paymentMethob) {
		this.paymentMethob = paymentMethob;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
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

}
