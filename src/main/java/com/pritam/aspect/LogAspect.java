package com.pritam.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

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
}
