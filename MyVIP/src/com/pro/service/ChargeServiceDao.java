package com.pro.service;



import com.pro.domain.ActivitySetting;
import com.pro.domain.Employee;
import com.pro.domain.VipCard;

public interface ChargeServiceDao {
	public VipCard queryVipCard(VipCard card);
	public void charge(Employee e,VipCard vc,int cMoney,String date);
	public ActivitySetting queryAcSetting(String date);
}
