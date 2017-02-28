package com.pro.domain;

import java.util.HashSet;
import java.util.Set;

public class ActivitySetting {
	private int acSettingId;
	private ActivityPriority priority;
	private String title;
	private String startDate;
	private String endDate;
	private Set<ActivityDetail> set=new HashSet<ActivityDetail>();
	
	public ActivitySetting() {
		super();
	}
	
	public ActivitySetting(int acSettingId, ActivityPriority priority,
			String title, String startDate, String endDate) {
		super();
		this.acSettingId = acSettingId;
		this.priority = priority;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public ActivitySetting(int acSettingId, ActivityPriority priority,
			String title, String startDate, String endDate, Set<ActivityDetail> set) {
		super();
		this.acSettingId = acSettingId;
		this.priority = priority;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.set = set;
	}

	public int getAcSettingId() {
		return acSettingId;
	}
	public void setAcSettingId(int acSettingId) {
		this.acSettingId = acSettingId;
	}
	public ActivityPriority getPriority() {
		return priority;
	}
	public void setPriority(ActivityPriority priority) {
		this.priority = priority;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Set<ActivityDetail> getSet() {
		return set;
	}
	public void setSet(Set<ActivityDetail> set) {
		this.set = set;
	}
	
}
