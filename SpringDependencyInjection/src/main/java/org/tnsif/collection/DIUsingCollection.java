package org.tnsif.collection;
//Program to demonstrate on DI in the form of collection
//Driver class
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingCollection {

	public static void main(String[] args) {
		ApplicationContext f=new ClassPathXmlApplicationContext("collect.xml");
		CollectionDemo d=f.getBean("collection",CollectionDemo.class);
		d.display();

	}

}
