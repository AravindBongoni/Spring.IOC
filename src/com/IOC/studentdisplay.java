package com.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentdisplay {

	public static void main(String[] args) {
		// Using Application Context
		ApplicationContext c = new ClassPathXmlApplicationContext("student.xml");
		 Student s1 = (Student) c.getBean("std1");
		 Student s2 = (Student) c.getBean("std2");
		 System.out.println("Student Deatils "+s1);
		 System.out.println("Student Deatails "+s2);

	}

}
