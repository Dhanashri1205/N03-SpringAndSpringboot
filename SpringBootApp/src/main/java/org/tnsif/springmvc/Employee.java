package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
//It is used to denote that  a class is a component
//It allows spring to automatically  dtect our customer beans
public class Employee {
	//data members
	private int empid;
	private String empname;
	
	//getters and setters
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
	
	public void print()
	{
		System.out.println("Employee are belongs to IT department....");
		System.out.println("Emp Id: "+empid+" Emp name: "+empname);

	}
	

}
