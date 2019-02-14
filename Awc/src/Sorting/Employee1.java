package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 
//Implement Comparable to sort Employee1 in reverse order on basis of Name, Salary and joining Date
class Employee1 implements Comparable<Employee1> {
    String name;
    Integer salary;
    Date JoiningDate;
 
    public Employee1() {
    }
 
    public Employee1(String n, Integer f, Date d) {
           name = n;
           salary = f;
           JoiningDate = d;
    }
 
    public String toString() {
           return "\n name=" + name + ",salary=" + salary + ",JoiningDate="
                        + JoiningDate;
    }
 
    public int compareTo(Employee1 o) {
           return o.name.compareTo(this.name) + (o.salary.compareTo(this.salary))
                        + (o.JoiningDate.compareTo(this.JoiningDate));
    }
}
 

 
   
 
