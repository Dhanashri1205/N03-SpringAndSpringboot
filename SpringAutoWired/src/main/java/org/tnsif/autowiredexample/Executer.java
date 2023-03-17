package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executer {

	public static void main(String[] args) {
		ApplicationContext f=new ClassPathXmlApplicationContext("web.xml");
		Director d=f.getBean("director",Director.class);
		d.accept();
		

	}

}
