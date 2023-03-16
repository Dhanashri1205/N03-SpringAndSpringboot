package org.tnsif.objectsInjection;
//Program to demonstrate in the form of objects
public class Cellphone {
	
	//DI in the form of object
	Charger charger;

	//DI using setters
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	//injecting the object of Charger class
	public void accept()
	{
		charger.power();
	}
	
	
	

}
