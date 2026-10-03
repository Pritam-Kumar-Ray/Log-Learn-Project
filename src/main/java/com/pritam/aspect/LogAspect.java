package com.pritam.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
@Slf4j
public class LogAspect {

//    @Before("execution(* com.pritam.services.LogService.dummyLogs(..))")
    @Before("execution(* com.pritam.services.*.*(..))")
    public void beforeLogAOP(){
        log.info("Before :: beforeLogAOP is called!!");
    }

    @After("execution(* com.pritam.services.*.*(..))")
    public void afterLogAOP(){
        log.info("After :: afterLogAOP is called!!");
    }

//    @Around("execution(* com.pritam..services..*(..))") -> Or we can use below
    @Around("execution(* com.pritam.services.*.*(..))")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {

        Long t1 = System.currentTimeMillis();
        log.info("Entering method: {}", joinPoint.getSignature().getName());

        Object result = joinPoint.proceed();

        Long t2 = System.currentTimeMillis();

        log.info("Time taken by the method: {}", t2-t1);
        log.info("Exiting method: {}", joinPoint.getSignature().getName());

        return result;
    }
}
