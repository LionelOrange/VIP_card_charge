package com.pro.domain;


public class Employee {
	private int empId;
	private String empName;
	private String password;
	private String workDate;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee(int empId, String empName, String password, String workDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.workDate = workDate;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
}
