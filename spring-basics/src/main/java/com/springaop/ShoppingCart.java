package com.springaop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        System.out.println("status:" + status);
    }
}
