package com.day2.encapsulation;

public class Student {
String name;
int regno;
int age;
float per;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	this.per = per;
}
@Override
public String toString() {
	return "Student [name=" + name + ", regno=" + regno + ", age=" + age + ", per=" + per + "]";
}

}
