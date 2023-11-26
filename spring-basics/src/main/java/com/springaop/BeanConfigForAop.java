package com.springaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springaop")
@EnableAspectJAutoProxy
public class BeanConfigForAop {

    @Bean
    ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
}
