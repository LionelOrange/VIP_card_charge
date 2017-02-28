package com.pro.test;

import com.pro.domain.ActivityDetail;
import com.pro.domain.ActivitySetting;
import com.pro.domain.Employee;
import com.pro.domain.Exchange;
import com.pro.domain.PointsRecord;
import com.pro.domain.VipCard;
import com.pro.service.ChargeServiceDao;
import com.pro.service.ChargeServiceDaoImpl;
import com.pro.service.ExchangeServiceDao;
import com.pro.service.ExchangeServiceDaoImpl;
import com.pro.service.VipCardServiceDao;
import com.pro.service.VipCardServiceDaoImpl;

import junit.framework.TestCase;

public class MyTest extends TestCase {
	public void testQuery4(){
		ExchangeServiceDao dao=new ExchangeServiceDaoImpl();
		boolean flag=dao.exchange(new Exchange(3),new VipCard("330411199507155768"),"2017-01-19");
		System.out.println(flag);
	}
	public void testQuery1(){
		ChargeServiceDao dao=new ChargeServiceDaoImpl();
		VipCard vc=dao.queryVipCard(new VipCard("330411199507155768"));
		dao.charge(vc.getEmployee(),vc,500,"2017-01-13");
		System.out.println("11");
	}
	public void testQuery2(){
		ChargeServiceDao dao=new ChargeServiceDaoImpl();
		VipCard vc=dao.queryVipCard(new VipCard("330411199507155768"));
		for (PointsRecord pr:vc.getSetPoint()) {
			System.out.println(pr.getPointsV()+":"+pr.getPointsAdDate());
		}
		System.out.println("11");
	}
	public void testQuery3(){
		ChargeServiceDao dao=new ChargeServiceDaoImpl();
		ActivitySetting ac=dao.queryAcSetting("2017-01-13 13:13:13");
		for(ActivityDetail d:ac.getSet()){
			System.out.println(d.getChMoney()+":"+d.getPointsValue());
		}
	}
	public void testAddCard(){
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		dao.add(new VipCard(new Employee(1),"3304213223157689","2017-01-09 12:12:12", "王胜","1995-07-14 23:23:23","17723438756","宁波"));
	}
}
