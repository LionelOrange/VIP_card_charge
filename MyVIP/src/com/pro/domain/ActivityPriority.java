package com.pro.domain;

public class ActivityPriority {
	private int priorityId;
	private int grade;
	
	public ActivityPriority() {
		super();
	}
	
	public ActivityPriority(int priorityId) {
		super();
		this.priorityId = priorityId;
	}

	public ActivityPriority(int priorityId, int grade) {
		super();
		this.priorityId = priorityId;
		this.grade = grade;
	}
	public int getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
