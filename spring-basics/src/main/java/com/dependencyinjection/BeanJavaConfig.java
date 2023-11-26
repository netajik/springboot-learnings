package com.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Java based configuration
 */
@Configuration
@ComponentScan(basePackages = "com.dependencyinjection")
public class BeanJavaConfig {

    // @Bean
    // Doctor doctor() {
    //     return new Doctor();
    // }
    
}
