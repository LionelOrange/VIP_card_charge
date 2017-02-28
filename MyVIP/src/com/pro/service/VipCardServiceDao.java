package com.pro.service;

import java.util.Map;

import com.pro.domain.VipCard;

public interface VipCardServiceDao {
	public void add(VipCard card);
	public void report(VipCard card);
	public Map<String, Object> queryPage(int currentPage,int pagesize);
	public Map<String, Object> queryChargeRe(int currentPage,int pagesize,int cardId);
	public Map<String, Object> queryPointRe(int currentPage,int pagesize,int cardId);
}
