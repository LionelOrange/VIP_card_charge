package com.pro.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.pro.dao.ExchangeDao;
import com.pro.dao.PointsRecordDao;
import com.pro.dao.ProductDao;
import com.pro.dao.VipCardDao;
import com.pro.domain.Exchange;
import com.pro.domain.PointsCategory;
import com.pro.domain.VipCard;
import com.pro.util.DBHelper;

public class ExchangeServiceDaoImpl implements ExchangeServiceDao {

	@Override
	public Map<String, Object> queryExchange(int currentPage, int pagesize) {
		SqlSession session=null;
		Map<String, Object> maps=new HashMap<String, Object>();
		try {
			session=DBHelper.getSession();
			ExchangeDao dao=session.getMapper(ExchangeDao.class);
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("p1", currentPage*pagesize);
			map.put("p2", (currentPage-1)*pagesize);
			List<Exchange> list=dao.queryExchange(map);
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

	@Override
	public boolean exchange(Exchange ex, VipCard vc,String date) {
		SqlSession session=null;
		boolean flag=true;
		try {
			session=DBHelper.getSession();
			ExchangeDao dao1=session.getMapper(ExchangeDao.class);
			Exchange exchange=dao1.queryByExchangeId(ex);
			VipCardDao dao2=session.getMapper(VipCardDao.class);
			VipCard card=dao2.query(vc);
			//添加积分记录表
			PointsRecordDao dao3=session.getMapper(PointsRecordDao.class);
			Map<String, Object> maps1=new HashMap<String, Object>();
			//设置积分类型,3是对应的是兑换积分类型
			maps1.put("t1", new PointsCategory(3));
			maps1.put("t2", card);
			maps1.put("t3", card.getEmployee());
			maps1.put("t4", date);
			maps1.put("t5", exchange.getExchangeP());
			dao3.exchange(maps1);
			//更新会员卡
			VipCardDao dao4=session.getMapper(VipCardDao.class);
			Map<String, Object> maps2=new HashMap<String, Object>();
			maps2.put("o2", card.getPoints()-exchange.getExchangeP());
			maps2.put("o3", vc);
			dao4.exchange(maps2);
			//更新产品表数量
			ProductDao dao5=session.getMapper(ProductDao.class);
			Map<String, Object> maps3=new HashMap<String, Object>();
			maps3.put("r1", exchange.getProduct().getQuantity()-1);
			maps3.put("r2", exchange.getProduct().getProductId());
			dao5.update(maps3);
			if(card.getPoints()<exchange.getExchangeP()){
				session.rollback();
				flag=false;
			}
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			flag=false;
		}finally{
			session.close();
		}
		return flag;
	}

}
