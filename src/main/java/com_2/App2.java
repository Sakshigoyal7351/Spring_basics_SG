package com_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		  ApplicationContext context= new ClassPathXmlApplicationContext("com_2/config2.xml");

		  
		  Learner l1=(Learner)context.getBean("lbean");
		  
		  System.out.println(l1);
	}

}
