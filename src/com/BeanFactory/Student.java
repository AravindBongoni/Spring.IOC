package com.BeanFactory;

public class Student {
 private int id;
 private String name;
 private String subject;
 private int marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
}
 
 
}
