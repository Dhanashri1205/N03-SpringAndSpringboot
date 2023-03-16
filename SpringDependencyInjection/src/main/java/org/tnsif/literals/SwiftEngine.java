package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	//Dependency injection in the form of literals
	private String company;
	private double cost;
	
	public double cost() {
		
		return cost;
	}
	public String display() {
		
		return "India";
	}
	
	//DI using setters
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//DI using constructor
	
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	
	//to string
	@Override
	public String toString() {
		return "Origin of company: "+company+" Fuel type:  "+fuel;
	}

	
	

}
