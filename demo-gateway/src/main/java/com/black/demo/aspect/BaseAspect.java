package com.black.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;

public class BaseAspect {

	@Pointcut("execution(*com.wanda.unicorn.icfwcore.gateway.controller.*.*(..))")
	protected void jointPointExpression() {
	}

	protected String getClassName(ProceedingJoinPoint pjp) {
		@SuppressWarnings("rawtypes")
		Class targetClass = pjp.getTarget().getClass();

		String[] classPath = targetClass.getName().split("\\.");
		int pathLength = classPath.length;
		String className = classPath[pathLength - 1];
		return className;
	}

}
