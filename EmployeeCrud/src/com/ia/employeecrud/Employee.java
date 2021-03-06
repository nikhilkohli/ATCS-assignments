package com.ia.employeecrud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="emmployeeid")
	private int empid;
	private String empname;
	private int empsal;
	private String empAdd;
	
	public Employee()
	{
		
	}
	
	public Employee(int empid, String empname, int empsal, String empAdd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empAdd = empAdd;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empAdd=" + empAdd + "]";
	}
	
	
	

}
