package com.pro.dao;

import java.util.List;
import java.util.Map;

import com.pro.domain.PointsRecord;

public interface PointsRecordDao {
	public void add(Map<String,Object> maps);
	public List<PointsRecord> queryPointRe(Map<String,Object> maps);
	public int totalRecord(int cardId);
	public void exchange(Map<String,Object> maps);
}
