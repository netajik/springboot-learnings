package com.dependencyinjection;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

import java.util.Objects;

@Scope(scopeName = "prototype")
@Component
public class Doctor implements HospitalStaff, BeanNameAware {

    private String qualification;

    public Doctor() {
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Doctor qualification(String qualification) {
        setQualification(qualification);
        return this;
    }

    @Override
    public String toString() {
        return "\n{" +
            " qualification='" + getQualification() + "'" +
            "}\n";
    }
    

    @Override
    public void assist() {
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(" Set bean name called\n");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct\n");
    }
}
