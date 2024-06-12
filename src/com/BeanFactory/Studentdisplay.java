package com.BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Studentdisplay {

	public static void main(String[] args) {
		// Using BeanFactory
		Resource r = new ClassPathResource("student2.xml");
		BeanFactory f = new XmlBeanFactory(r);
		Student s1 = (Student) f.getBean("std1");
		Student s2 = (Student) f.getBean("std2");
		System.out.println(s1);
		System.out.println(s2);
	}

}
