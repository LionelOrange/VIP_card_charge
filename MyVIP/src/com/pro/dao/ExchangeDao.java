package com.pro.dao;

import java.util.List;
import java.util.Map;

import com.pro.domain.Exchange;

public interface ExchangeDao {
	public List<Exchange> queryExchange(Map<String, Object> map);
	public int totalRecord();
	public Exchange queryByExchangeId(Exchange ex);
}
