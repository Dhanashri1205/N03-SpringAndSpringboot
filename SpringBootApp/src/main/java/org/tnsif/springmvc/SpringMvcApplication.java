package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication//
//1) @configuration : Instructs that a spring configuration class is being used instead of XML to define the components
//2) @EnableAutoconfiguration : is a Spring boot specific annotation Instructs that the application should auto configure the other frameworks included as dependency with spring.
//3) @ComponentScan: Scans project for spring components annotation with @Service, @Repository, @component
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		//System.out.println("Enter the value: ");
		Scanner sc=new Scanner(System.in);
		/*int n= sc.nextInt();
		System.out.println("Value is: "+n);*/
		/*Employee e= context.getBean(Employee.class);
		e.setEmpid(101);
		e.setEmpname("Dhanashri");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();

		
	}

}
