package com.pro.domain;

public class PointsCategory {
	private int pointsCategory;
	private String categoryName;
	
	public PointsCategory() {
		super();
	}
	
	public PointsCategory(int pointsCategory) {
		super();
		this.pointsCategory = pointsCategory;
	}
	
	public PointsCategory(int pointsCategory, String categoryName) {
		super();
		this.pointsCategory = pointsCategory;
		this.categoryName = categoryName;
	}

	public int getPointsCategory() {
		return pointsCategory;
	}
	public void setPointsCategory(int pointsCategory) {
		this.pointsCategory = pointsCategory;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
