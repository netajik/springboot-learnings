package com.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(com..*)")
    public void authenciationPointcut() {

    }
 
    @Pointcut("within(com..*)")
    public void authorizationPointcut() {

    }

    @Before("authenciationPointcut() && authorizationPointcut()")
    public void authenciate() {
        System.out.println("Authenticating the request...");
    }
}
