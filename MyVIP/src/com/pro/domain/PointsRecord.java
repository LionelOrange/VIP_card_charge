package com.pro.domain;


public class PointsRecord {
	private int pointsReId;
	private PointsCategory category;
	private VipCard card;
	private Employee employee;
	private String pointsAdDate;
	private int pointsV;
	
	public PointsRecord() {
		super();
	}
	public PointsRecord(int pointsReId, PointsCategory category,
			String pointsAdDate, int pointsV) {
		super();
		this.pointsReId = pointsReId;
		this.category = category;
		this.pointsAdDate = pointsAdDate;
		this.pointsV = pointsV;
	}
	public int getPointsReId() {
		return pointsReId;
	}
	public void setPointsReId(int pointsReId) {
		this.pointsReId = pointsReId;
	}
	public PointsCategory getCategory() {
		return category;
	}
	public void setCategory(PointsCategory category) {
		this.category = category;
	}
	public VipCard getCard() {
		return card;
	}
	public void setCard(VipCard card) {
		this.card = card;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getPointsAdDate() {
		return pointsAdDate;
	}
	public void setPointsAdDate(String pointsAdDate) {
		this.pointsAdDate = pointsAdDate;
	}
	public int getPointsV() {
		return pointsV;
	}
	public void setPointsV(int pointsV) {
		this.pointsV = pointsV;
	}
	
}
