package com.io.springcoreexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
	

	
	Resource resource = new ClassPathResource("springConfig.xml");
	
	
	BeanFactory factory= new XmlBeanFactory(resource);
	
	  Employee emp =(Employee) factory.getBean("empobj");
	  
	  System.out.println(emp);
	  
    Employee emp1 =(Employee) factory.getBean("empobj1");
	  
	  System.out.println(emp1);
	
	
	
}
}