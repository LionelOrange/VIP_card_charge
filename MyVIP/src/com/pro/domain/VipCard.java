package com.pro.domain;

import java.util.HashSet;
import java.util.Set;


public class VipCard {
	private String cardId;
	private CardStatus status;
	private Employee employee;
	private String identity;
	private int points;
	private int balance;
	//开始时间
	private String newCard;
	private String finalDate;
	private String cardName;
	private String birthday;
	private String tel;
	private String address;
	Set<ChargeRecord> setCharge=new HashSet<ChargeRecord>();
	Set<PointsRecord> setPoint=new HashSet<PointsRecord>();
	public VipCard() {
		super();
	}
	
	public VipCard(String cardId, String identity) {
		super();
		this.cardId = cardId;
		this.identity = identity;
	}
	
	public VipCard(String cardId, CardStatus status, Employee employee,
			String identity, int points, int balance, String newCard,
			String finalDate, String cardName, String birthday, String tel,
			String address, Set<ChargeRecord> setCharge,
			Set<PointsRecord> setPoint) {
		super();
		this.cardId = cardId;
		this.status = status;
		this.employee = employee;
		this.identity = identity;
		this.points = points;
		this.balance = balance;
		this.newCard = newCard;
		this.finalDate = finalDate;
		this.cardName = cardName;
		this.birthday = birthday;
		this.tel = tel;
		this.address = address;
		this.setCharge = setCharge;
		this.setPoint = setPoint;
	}

	public VipCard( Employee employee, String identity,
			 String newCard, 
			String cardName, String birthday, String tel, String address) {
		super();
		this.employee = employee;
		this.identity = identity;
		this.newCard = newCard;
		this.cardName = cardName;
		this.birthday = birthday;
		this.tel = tel;
		this.address = address;
	}

	public VipCard(String identity) {
		super();
		this.identity = identity;
	}
	
	public Set<ChargeRecord> getSetCharge() {
		return setCharge;
	}

	public void setSetCharge(Set<ChargeRecord> setCharge) {
		this.setCharge = setCharge;
	}

	public Set<PointsRecord> getSetPoint() {
		return setPoint;
	}

	public void setSetPoint(Set<PointsRecord> setPoint) {
		this.setPoint = setPoint;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public CardStatus getStatus() {
		return status;
	}
	public void setStatus(CardStatus status) {
		this.status = status;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getNewCard() {
		return newCard;
	}
	public void setNewCard(String newCard) {
		this.newCard = newCard;
	}
	public String getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
