package com.pro.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import org.apache.ibatis.session.SqlSession;

import com.pro.dao.ActivitySettingDao;
import com.pro.dao.ChargeRecordDao;
import com.pro.dao.PointsRecordDao;
import com.pro.dao.VipCardDao;
import com.pro.domain.ActivityDetail;
import com.pro.domain.ActivitySetting;
import com.pro.domain.ChargeRecord;
import com.pro.domain.Employee;
import com.pro.domain.PointsCategory;
import com.pro.domain.VipCard;
import com.pro.util.DBHelper;

public class ChargeServiceDaoImpl implements ChargeServiceDao {

	//充值
	@Override
	public void charge(Employee e,VipCard vc,int cMoney,String date) {
		SqlSession session=null;
		int pointsValue=0;
		try {
			session=DBHelper.getSession();
			ActivitySettingDao dao=session.getMapper(ActivitySettingDao.class);
			ChargeRecordDao dao1=session.getMapper(ChargeRecordDao.class);
			PointsRecordDao dao2=session.getMapper(PointsRecordDao.class);
			VipCardDao dao3=session.getMapper(VipCardDao.class);
			//将数据添加到充值记录表
			Map<String, Object> maps=new HashMap<String, Object>();
			maps.put("p1", e);
			maps.put("p2", vc);
			maps.put("p3", cMoney);
			maps.put("p4", date);
			dao1.add(maps);
			//查询对应充值金额的积分，规则是满足充值条件的每个明细表积分和
			ActivitySetting ac=dao.query(new ChargeRecord(date));
			Set<ActivityDetail> set=ac.getSet();
			for(ActivityDetail d:set){
				if(cMoney>=d.getChMoney()){
					pointsValue+=d.getPointsValue();
				}
			}
			//添加积分记录表
			Map<String, Object> maps1=new HashMap<String, Object>();
			//设置积分类型,1是对应的是充值积分类型
			maps1.put("t1", new PointsCategory(1));
			
			maps1.put("t2", vc);
			maps1.put("t3", e);
			maps1.put("t4", date);
			maps1.put("t5", pointsValue);
			dao2.add(maps1);
			//更新会员卡
			Map<String, Object> maps2=new HashMap<String, Object>();
			maps2.put("o1", vc.getBalance()+cMoney);
			maps2.put("o2", vc.getPoints()+pointsValue);
			maps2.put("o3", vc);
			dao3.update(maps2);
			session.commit();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		
	}
	//根据身份证查找会员卡
	@Override
	public VipCard queryVipCard(VipCard card) {
		SqlSession session=null;
		VipCard vc=null;
		try {
			session=DBHelper.getSession();
			VipCardDao dao=session.getMapper(VipCardDao.class);
			vc=dao.query(card);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return vc;
	}
	@Override
	public ActivitySetting queryAcSetting(String date) {
		SqlSession session=null;
		ActivitySetting ac=null;
		try {
			session=DBHelper.getSession();
			ActivitySettingDao dao=session.getMapper(ActivitySettingDao.class);
			ac=dao.query(new ChargeRecord(date));
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return ac;
	}

}
