package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecuter {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("beans.xml");
		SwiftEngine e= f.getBean("Renault REX",SwiftEngine.class);
		System.out.println(e);
		System.out.println("Cost: "+e.cost());
		System.out.println("Company location: "+e.display());


	}

}
