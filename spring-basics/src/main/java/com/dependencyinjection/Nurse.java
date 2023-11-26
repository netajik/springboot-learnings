package com.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements HospitalStaff {

    @Override
    public void assist() {
        System.out.println("Nurse is assisting");
    }

}
