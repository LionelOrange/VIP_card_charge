package com.pro.domain;

public class CardStatus {
	private int cardStatusId;
	private int cardStatus;
	
	public CardStatus() {
		super();
	}
	
	public CardStatus(int cardStatusId) {
		super();
		this.cardStatusId = cardStatusId;
	}
	
	public CardStatus(int cardStatusId, int cardStatus) {
		super();
		this.cardStatusId = cardStatusId;
		this.cardStatus = cardStatus;
	}

	public int getCardStatusId() {
		return cardStatusId;
	}
	public void setCardStatusId(int cardStatusId) {
		this.cardStatusId = cardStatusId;
	}
	public int getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}
	
}
