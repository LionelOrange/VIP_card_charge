package com.pro.dao;

import java.util.List;
import java.util.Map;

import com.pro.domain.VipCard;

public interface VipCardDao {
	//兑换时更新会员卡
	public void exchange(Map<String, Object> maps);
	//更新会员卡
	public void update(Map<String, Object> maps);
	//根据身份查询
	public VipCard query(VipCard card);
	//分页查询
	public List<VipCard> queryPage(Map<String, Object> maps);
	//查询会员卡条数
	public int totalRecord();
	//新建会员卡
	public void add(VipCard card);
	//挂失
	public void report(VipCard card);
}
