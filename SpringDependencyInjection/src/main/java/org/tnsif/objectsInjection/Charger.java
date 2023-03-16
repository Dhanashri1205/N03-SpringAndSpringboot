package org.tnsif.objectsInjection;

public class Charger {
	
	//private data members
	private String brand;
	private int volt;
	private String type;
	
	//DI using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setVolt(int volt) {
		this.volt = volt;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void power()
	{
		System.out.println("Details related to charger....");
		System.out.println("Brand: "+brand+" Voltage: "+volt+" Charger-Type: "+type);
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", volt=" + volt + ", type=" + type + "]";
	}

	
	
	
	
	

}
