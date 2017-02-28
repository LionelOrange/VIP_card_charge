package com.pro.domain;

public class ActivityDetail {
	private int detailId;
	private ActivitySetting setting;
	private int chMoney;
	private int pointsValue;
	
	public ActivityDetail() {
		super();
	}
	
	public ActivityDetail(int detailId) {
		super();
		this.detailId = detailId;
	}
	
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public ActivitySetting getSetting() {
		return setting;
	}
	public void setSetting(ActivitySetting setting) {
		this.setting = setting;
	}
	public int getChMoney() {
		return chMoney;
	}
	public void setChMoney(int chMoney) {
		this.chMoney = chMoney;
	}
	public int getPointsValue() {
		return pointsValue;
	}
	public void setPointsValue(int pointsValue) {
		this.pointsValue = pointsValue;
	}
	
}
