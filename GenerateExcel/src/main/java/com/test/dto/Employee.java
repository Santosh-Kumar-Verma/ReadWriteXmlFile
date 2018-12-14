package com.test.dto;

public class Employee {

	private Long empId;
	private String empName;
	private Long mobileNo;
	private String dob;
	
	
	
	public Employee(Long empId, Long mobileNo,String empName,String dob) {
		this.empId = empId;
		this.mobileNo = mobileNo;
		this.empName = empName;
		this.dob = dob;
	}

	public Employee() {}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
