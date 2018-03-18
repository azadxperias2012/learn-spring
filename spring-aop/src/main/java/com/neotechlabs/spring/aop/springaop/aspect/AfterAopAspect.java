package com.neotechlabs.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value="com.neotechlabs.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning="result"
			)
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info(" {} returned with value {}", joinPoint, result);
	}
	
	@After(value="com.neotechlabs.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info(" completed execution for {}", joinPoint);
	}

}