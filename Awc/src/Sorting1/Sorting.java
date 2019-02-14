package Sorting1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import Sorting1.EmployeeAgeComparator1;
import Sorting1.Employee;

public class Sorting {

	public static void main(String[] args) throws ParseException {
		ArrayList<Employee> al=new ArrayList<Employee>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		al.add(new Employee(1,"Anil", 45,"noida", 80000,dateFormatter.parse("2013-03-30")));
		al.add(new Employee(2,"Tripathi", 35,"noida", 70000,dateFormatter.parse("2015-04-30")));
		al.add(new Employee(3,"Raushan", 27,"noida", 60000,dateFormatter.parse("2012-05-30")));
		al.add(new Employee(4,"Abhishek", 23,"noida", 5000,dateFormatter.parse("2016-09-30")));
		al.add(new Employee(5,"Ramlal", 56,"noida", 10000,dateFormatter.parse("2014-08-30")));
		//Collections.sort(al,new EmployeeAgeComparator());
		Collections.sort(al, new EmployeeAgeComparator1());
		
		
    for(Employee e:al) {
    	System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getCity()+" "+e.getSalary()+" "+e.getJoiningdate());
    }
	}

}
