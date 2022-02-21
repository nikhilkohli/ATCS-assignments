package javapractice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	
	private String empname;
    private int empcode;
	private int empsalary;
	private String empaddress;
	private int emppincode;
	
	
	public Employee()
	{
		
	}
	
	public Employee(String empname,int empcode, int empsalary, String empaddress,
			int emppincode) {
		
		this.empname = empname;
		this.empcode = empcode;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emppincode = emppincode;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public int getEmppincode() {
		return emppincode;
	}

	public void setEmppincode(int emppincode) {
		this.emppincode = emppincode;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empcode=" + empcode + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emppincode=" + emppincode + "]";
	}
	
}

