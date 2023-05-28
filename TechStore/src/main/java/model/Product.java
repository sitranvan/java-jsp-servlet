package model;

public class Product {
	private String productId;
	private String productName;
	private Producer producer;
	private String productDesc;
	private double productPrice;
	private int quantity;
	private Category category;

	public Product() {
		super();
	}

	public Product(String productId, String productName, Producer producer, String productDesc, double productPrice,
			int quantity, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.producer = producer;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.category = category;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
