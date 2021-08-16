/**
 * 
 */
package com.ofs.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author USER
 *
 */
@Aspect
@Component
public class ProductsAspect {
	public static final Logger LOGGER = LoggerFactory.getLogger(ProductsAspect.class);

	@Before(value = "execution(* com.ofs.aop.service.ProductsService.*(..))")
	public void beforeLog(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		LOGGER.info(methodName + " is started execution");
	}

	@After(value = "execution(* com.ofs.aop.service.*.*(..))")
	public void afterLog(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		LOGGER.info(methodName + " is completed execution");
	}

	@AfterReturning(value = "execution(* com.ofs.aop.service.*.*(..))")
	public void afterReturnLog() {
		LOGGER.info("ProductService Method is Returned");
	}

	@AfterThrowing(value = "execution(* com.ofs.aop.service.*.*(..))")
	public void afterThrowLog() {
		LOGGER.info("ProductService Method is thrown exception");
	}

	@Around(value = "execution(* com.ofs.aop.service.*.*(..))")
	public void aroundLog(ProceedingJoinPoint pj) {
		LOGGER.info("ProductService Method Around log - before");
		try {
			pj.proceed(); // this statement invokes actual business method
		} catch (Throwable e) {
			LOGGER.info(e.getMessage());
		}
		LOGGER.info("ProductService Method Around log - ageter");
	}
	
}
