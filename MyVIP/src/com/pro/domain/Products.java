package com.pro.domain;

public class Products {
	private int productId;
	private String productName;
	private int quantity;
	private int incomePrice;
	private Provider provider;
	private int salesPrice;
	private Categorys categorys;
	public Products(){}
	public Products(int productId){
		super();
		this.productId=productId;
	}
	public Products(int productId,String productName){
		this.productId=productId;
		this.productName=productName;
	}
	
	public Products(int productId, String productName, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getIncomePrice() {
		return incomePrice;
	}
	public void setIncomePrice(int incomePrice) {
		this.incomePrice = incomePrice;
	}
	public int getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Categorys getCategorys() {
		return categorys;
	}
	public void setCategorys(Categorys categorys) {
		this.categorys = categorys;
	}

	
}
