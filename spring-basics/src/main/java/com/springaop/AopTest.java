package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfigForAop.class);
        ShoppingCart shoppingCart = applicationContext.getBean(ShoppingCart.class);
        shoppingCart.checkout("Success");
    }   
}
