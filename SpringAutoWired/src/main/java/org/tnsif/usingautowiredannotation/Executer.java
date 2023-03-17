package org.tnsif.usingautowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executer {

	public static void main(String[] args) {
		ApplicationContext f=new ClassPathXmlApplicationContext("bean.xml");
		Remote r= f.getBean("remote",Remote.class);
		r.remote();


	}

}
