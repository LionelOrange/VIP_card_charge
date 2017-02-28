package com.pro.domain;

public class Exchange {
	private int exchagePrId;
	private Products product;
	private int exchangeP;
	
	public Exchange() {
		super();
	}
	
	public Exchange(int exchagePrId) {
		super();
		this.exchagePrId = exchagePrId;
	}

	public Exchange(int exchagePrId, int exchangeP) {
		super();
		this.exchagePrId = exchagePrId;
		this.exchangeP = exchangeP;
	}

	public Exchange(int exchagePrId, Products product, int exchangeP) {
		super();
		this.exchagePrId = exchagePrId;
		this.product = product;
		this.exchangeP = exchangeP;
	}

	public int getExchagePrId() {
		return exchagePrId;
	}
	public void setExchagePrId(int exchagePrId) {
		this.exchagePrId = exchagePrId;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public int getExchangeP() {
		return exchangeP;
	}
	public void setExchangeP(int exchangeP) {
		this.exchangeP = exchangeP;
	}

	
}
