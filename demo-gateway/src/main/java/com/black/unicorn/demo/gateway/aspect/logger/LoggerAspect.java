package com.black.unicorn.demo.gateway.aspect.logger;

import com.black.unicorn.demo.gateway.aspect.BaseAspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *  @author chen
 */
@Order(1)
@Aspect
@Slf4j(topic="controller_digest")
@Component
public class LoggerAspect extends BaseAspect {
	
	/**
	 * 日志打印切面(方法的描述)
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
    @Around(value = "(execution(public * com.black.unicorn.demo.gateway.controller..*.*(..)) && (execution (@org.springframework.web.bind.annotation.RequestMapping * *(..))))")
	public Object loggerPrint(ProceedingJoinPoint pjp) throws Throwable {
		Object retObject = null;
		try {
			log.info("请求模块: {}; 请求业务: {}; 请求参数: {}", getClassName(pjp),
                    pjp.getSignature().getName(), Arrays.toString(pjp.getArgs()));
			long beginDate = System.currentTimeMillis();
			retObject = pjp.proceed();
			long endDate = System.currentTimeMillis();
			long intervalDate = endDate - beginDate;
			log.info("{}; {}; {}; {}; {}; {}ms", getClassName(pjp), pjp.getSignature().getName(),
                    Arrays.toString(pjp.getArgs()), retObject, "Y", intervalDate);
		} catch (Exception e) {
			log.error("{}; {}; {}; {}; {}", getClassName(pjp), pjp.getSignature().getName(), Arrays.toString(pjp.getArgs()), "N", e);
            throw e;
		}
		return retObject;
	}
}
