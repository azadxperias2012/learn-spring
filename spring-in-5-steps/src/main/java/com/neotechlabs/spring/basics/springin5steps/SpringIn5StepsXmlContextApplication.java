package com.neotechlabs.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neotechlabs.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.neotechlabs.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsXmlContextApplication {
	
	static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getXmlJdbcConnection());
		}
			
	}
}
