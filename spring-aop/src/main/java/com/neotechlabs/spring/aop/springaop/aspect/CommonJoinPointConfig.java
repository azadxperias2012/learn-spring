package com.neotechlabs.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.neotechlabs.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.neotechlabs.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.neotechlabs.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.neotechlabs.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(* com.neotechlabs.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}

}
