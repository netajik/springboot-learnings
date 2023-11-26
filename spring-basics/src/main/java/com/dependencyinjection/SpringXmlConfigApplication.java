package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringXmlConfigApplication {

	public static void main(String[] args) {
		/**
		 * Xml based configuration
		 */
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanJavaConfig.class);
		
		// accessig doctor object using class name
		Doctor doctor = applicationContext.getBean(Doctor.class);
		doctor.setQualification("MBBS");
		doctor.assist();
		System.out.println(doctor);

		// accessing docter object using id name
		// HospitalStaff doctor1 = (Doctor) applicationContext.getBean("doctor");
		// Doctor doctor1 = (Doctor) applicationContext.getBean(Doctor.class);
		// doctor1.assist();
		// System.out.println(doctor1);


		Nurse nurse = (Nurse) applicationContext.getBean("nurse");
		nurse.assist();

		// ConfigurableApplicationContext con =
		// SpringApplication.run(SpringPracticeApplication.class, args);
		// con.getBean(ShoppingCart.class).checkout("Ordered");
	}

}
