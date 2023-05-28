package model;

public class OrderDetail {
	private String orderDetailId;
	private Order order;
	private Product product;
	private int quantity;
	private double originalPrice;
	private double discountedPrice;
	private double VAT;
	private double totalAmount;

	public OrderDetail() {
		super();
	}

	public OrderDetail(String orderDetailId, Order order, Product product, int quantity, double originalPrice,
			double discountedPrice, double vAT, double totalAmount) {
		super();
		this.orderDetailId = orderDetailId;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.originalPrice = originalPrice;
		this.discountedPrice = discountedPrice;
		VAT = vAT;
		this.totalAmount = totalAmount;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double VAT) {
		this.VAT = VAT;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
