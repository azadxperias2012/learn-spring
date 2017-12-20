package com.neotechlabs.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.neotechlabs.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
	}

}
