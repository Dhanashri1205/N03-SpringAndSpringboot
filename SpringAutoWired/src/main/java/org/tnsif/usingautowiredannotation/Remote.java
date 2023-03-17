package org.tnsif.usingautowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	//DI in the form of object
	private Cell cell;

	//DI using setters
	// to achieve autowired using setter , use @Autowired annotation
	@Autowired 
	//When you have created multiple bean then
	//if you want to acess a perticular one then use this annotation
	
	@Qualifier("cell1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	//Default constructor
	public Remote() {
		super();
		System.out.println("Default constructor for Remote");
	}
	
	
	//Injecting the object of cell class
	public void remote()
	{
		cell.power();
	}
	
	

}
