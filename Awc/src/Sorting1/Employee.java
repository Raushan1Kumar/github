package Sorting1;

import java.util.Date;

public class Employee {
private int id;
private String name;
private int age;
private String city;
private int salary;
private Date joiningdate;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public Date getJoiningdate() {
	return joiningdate;
}
public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
}
public Employee(int id,String name, int age, String city,int salary,Date joiningdate ) {
	this.id=id;
    this.name = name;
    this.age = age;
    this.city=city;
    this.salary = salary;
    this.joiningdate=joiningdate;
}
}
