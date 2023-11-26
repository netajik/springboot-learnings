package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

    @Before("execution(* com.springaop.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        String arg = joinPoint.getArgs()[0].toString();
        System.out.println("argument: " + arg);
        System.out.println("Before Loggers Aspect");
    }

    @After("execution(* com.springaop.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logger");
    }
}
