package org.tnsif.autowiredexample;

public class Director {
	Actor a;

	public void setA(Actor a) {
		this.a = a;
	}
	
	public void accept()
	{
		a.script();
	}

	public Director(Actor a) {
		super();
		this.a = a;
		System.out.println("Autowired using constructor");
	}

	
}
