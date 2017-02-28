package com.pro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.pro.domain.Employee;
import com.pro.domain.Exchange;
import com.pro.domain.VipCard;
import com.pro.service.ChargeServiceDao;
import com.pro.service.ChargeServiceDaoImpl;
import com.pro.service.ExchangeServiceDao;
import com.pro.service.ExchangeServiceDaoImpl;
import com.pro.service.VipCardServiceDao;
import com.pro.service.VipCardServiceDaoImpl;

public class VipCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String me=req.getParameter("me");
		if("queryVip".equals(me)){
			queryVip(req,resp);
		}else if("charge".equals(me)){
			charge(req,resp);
		}else if("report".equals(me)){
			report(req,resp);
		}else if("add".equals(me)){
			add(req,resp);
		}else if("queryChargeRe".equals(me)){
			queryChargeRe(req,resp);
		}else if("queryPointRe".equals(me)){
			queryPointRe(req,resp);
		}else if("queryExchange".equals(me)){
			queryExchange(req,resp);
		}else if("exchange".equals(me)){
			exchange(req,resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	private void exchange(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		String identity=req.getParameter("identity");
		String exchagePrId=req.getParameter("exchagePrId");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime=df.format(new Date());
		ExchangeServiceDao dao=new ExchangeServiceDaoImpl();
		dao.exchange(new Exchange(Integer.parseInt(exchagePrId)),new VipCard(identity), currentTime);
	}
	private void queryExchange(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int currentPage=Integer.parseInt(req.getParameter("page"));
		int pagesize=Integer.parseInt(req.getParameter("rows"));
		ExchangeServiceDao dao=new ExchangeServiceDaoImpl();
		Map<String, Object> map=dao.queryExchange(currentPage, pagesize);
		String jsonStr=JSON.toJSONString(map);
		System.out.println(jsonStr);
		PrintWriter out=resp.getWriter();
		out.write(jsonStr);
		out.flush();
	}
	private void queryPointRe(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cardId=req.getParameter("carId");
		int currentPage=Integer.parseInt(req.getParameter("page"));
		int pagesize=Integer.parseInt(req.getParameter("rows"));
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		Map<String, Object> map=dao.queryPointRe(currentPage, pagesize, Integer.parseInt(cardId));
		String jsonStr=JSON.toJSONString(map);
		System.out.println(jsonStr);
		PrintWriter out=resp.getWriter();
		out.write(jsonStr);
		out.flush();
	}
	private void queryChargeRe(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cardId=req.getParameter("carId");
		int currentPage=Integer.parseInt(req.getParameter("page"));
		int pagesize=Integer.parseInt(req.getParameter("rows"));
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		Map<String, Object> map=dao.queryChargeRe(currentPage, pagesize, Integer.parseInt(cardId));
		String jsonStr=JSON.toJSONString(map);
		System.out.println(jsonStr);
		PrintWriter out=resp.getWriter();
		out.write(jsonStr);
		out.flush();
	}
	private void add(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String identity=req.getParameter("identity");
		String cardName=req.getParameter("cardName");
		String birthday=req.getParameter("birthday");
		String tel=req.getParameter("tel");
		String address=req.getParameter("address");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime=df.format(new Date());
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		dao.add(new VipCard(new Employee(1),identity,currentTime, cardName,birthday,tel,address));
	}
	private void report(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String identity=req.getParameter("id");
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		dao.report(new VipCard(identity));
	}
	private void charge(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String identity=req.getParameter("identity");
		String cMoney=req.getParameter("cMoney");
		ChargeServiceDao dao=new ChargeServiceDaoImpl();
		VipCard vc=dao.queryVipCard(new VipCard(identity));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime=df.format(new Date());
		dao.charge(vc.getEmployee(),vc,Integer.parseInt(cMoney),currentTime);
	}
	private void queryVip(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String currentPage=req.getParameter("page");
		String pagesize=req.getParameter("rows");
		VipCardServiceDao dao=new VipCardServiceDaoImpl();
		Map<String, Object> map=dao.queryPage(Integer.parseInt(currentPage), Integer.parseInt(pagesize));
		String jsonStr=JSON.toJSONString(map);
		System.out.println(jsonStr);
		PrintWriter out=resp.getWriter();
		out.write(jsonStr);
		out.flush();
	}
}
