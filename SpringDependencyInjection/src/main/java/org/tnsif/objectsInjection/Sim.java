package org.tnsif.objectsInjection;

public class Sim {
	
	//private data members
	private String simType;
	private String company;
	
	//DI using setters
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Sim [simType=" + simType + ", company=" + company + "]";
	}
	
	

}
