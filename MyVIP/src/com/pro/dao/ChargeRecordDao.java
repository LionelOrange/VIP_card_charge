package com.pro.dao;

import java.util.List;
import java.util.Map;

import com.pro.domain.ChargeRecord;


public interface ChargeRecordDao {
	public void add(Map<String,Object> maps);
	public List<ChargeRecord> queryChargeRe(Map<String,Object> maps);
	public int totalRecord(int cardId);
}
