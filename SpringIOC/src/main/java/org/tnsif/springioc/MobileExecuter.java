package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Driver class
public class MobileExecuter {

	public static void main(String[] args) {
		
		//hard coding
		/*Airtel a=new Airtel();
		a.call();
		a.message();
		
		Jio j=new Jio();
		j.call();
		j.message();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		/*Airtel a=(Airtel) c.getBean("airtel");
		a.call();
		a.message();
		
		Jio j= (Jio) c.getBean("jio");
		j.call();
		j.message();*/
		
		Sim s=c.getBean("sim",Sim.class);
		s.call();
		s.message();

		
		

	}

}
