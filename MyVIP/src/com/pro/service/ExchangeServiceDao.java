package com.pro.service;

import java.util.Map;

import com.pro.domain.Exchange;
import com.pro.domain.VipCard;

public interface ExchangeServiceDao {
	//查询兑换产品表
	public Map<String, Object> queryExchange(int currentPage,int pagesize);
	//根据兑换产品编号查询兑换产品表
	public boolean exchange(Exchange ex,VipCard vc,String date);
}
