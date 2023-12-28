package com.api.springboottutorial.error;

public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
