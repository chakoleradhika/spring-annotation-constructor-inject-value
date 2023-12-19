package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson 
{
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Person person =(Person) context.getBean("person");
		
		System.out.println(person.age);
		System.out.println(person.email);
	}

}
