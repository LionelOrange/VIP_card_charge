package com.pro.domain;


public class ChargeRecord {
	private int chargeReId;
	private Employee employee;
	private VipCard card;
	private int chMoney;
	private String chDate;
	
	public ChargeRecord() {
		super();
	}
	public ChargeRecord(int chMoney, String chDate) {
		super();
		this.chMoney = chMoney;
		this.chDate = chDate;
	}
	public ChargeRecord(String chDate) {
		super();
		this.chDate = chDate;
	}
	public ChargeRecord(int chargeReId, int chMoney, String chDate) {
		super();
		this.chargeReId = chargeReId;
		this.chMoney = chMoney;
		this.chDate = chDate;
	}
	
	public int getChargeReId() {
		return chargeReId;
	}
	public void setChargeReId(int chargeReId) {
		this.chargeReId = chargeReId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public VipCard getCard() {
		return card;
	}
	public void setCard(VipCard card) {
		this.card = card;
	}
	public int getChMoney() {
		return chMoney;
	}
	public void setChMoney(int chMoney) {
		this.chMoney = chMoney;
	}
	public String getChDate() {
		return chDate;
	}
	public void setChDate(String chDate) {
		this.chDate = chDate;
	}
	
}
