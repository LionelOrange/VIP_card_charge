package com.pro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.pro.dao.ChargeRecordDao;
import com.pro.dao.PointsRecordDao;
import com.pro.dao.VipCardDao;
import com.pro.domain.ChargeRecord;
import com.pro.domain.PointsRecord;
import com.pro.domain.VipCard;
import com.pro.util.DBHelper;

public class VipCardServiceDaoImpl implements VipCardServiceDao {
	//新建会员卡
	@Override
	public void add(VipCard card) {
		SqlSession session=null;
		try {
			session=DBHelper.getSession();
			VipCardDao dao=session.getMapper(VipCardDao.class);
			dao.add(card);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
	}
	//挂失
	@Override
	public void report(VipCard card) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		try {
			session=DBHelper.getSession();
			VipCardDao dao=session.getMapper(VipCardDao.class);
			dao.report(card);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
	}
	@Override
	public Map<String, Object> queryPage(int currentPage, int pagesize) {
		SqlSession session=null;
		Map<String, Object> maps=new HashMap<String, Object>();
		try {
			session=DBHelper.getSession();
			VipCardDao dao=session.getMapper(VipCardDao.class);
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("p1", currentPage*pagesize);
			map.put("p2", (currentPage-1)*pagesize);
			List<VipCard> list=dao.queryPage(map);
			int totalRecord=dao.totalRecord();
			maps.put("rows", list);
			maps.put("total", totalRecord);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return maps;
	}
	//分页查询对应会员卡的充值记录明细
	@Override
	public Map<String, Object> queryChargeRe(int currentPage, int pagesize,int cardId) {
		SqlSession session=null;
		Map<String, Object> maps=new HashMap<String, Object>();
		try {
			session=DBHelper.getSession();
			ChargeRecordDao dao=session.getMapper(ChargeRecordDao.class);
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("p1", currentPage*pagesize);
			map.put("p2", (currentPage-1)*pagesize);
			map.put("p3", cardId);
			List<ChargeRecord> list=dao.queryChargeRe(map);
			int totalRecord=dao.totalRecord(cardId);
			maps.put("rows", list);
			maps.put("total", totalRecord);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return maps;
	}
	//分页查询对应会员卡的积分记录明细
	@Override
	public Map<String, Object> queryPointRe(int currentPage, int pagesize,
			int cardId) {
		SqlSession session=null;
		Map<String, Object> maps=new HashMap<String, Object>();
		try {
			session=DBHelper.getSession();
			PointsRecordDao dao=session.getMapper(PointsRecordDao.class);
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("p1", currentPage*pagesize);
			map.put("p2", (currentPage-1)*pagesize);
			map.put("p3", cardId);
			List<PointsRecord> list=dao.queryPointRe(map);
			int totalRecord=dao.totalRecord(cardId);
			maps.put("rows", list);
			maps.put("total", totalRecord);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return maps;
	}

}
