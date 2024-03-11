package com_3_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com_3_Autowiring/config3.xml");

		Employee e1=context.getBean("emp1", Employee.class);
		System.out.println(e1);

	}

}
