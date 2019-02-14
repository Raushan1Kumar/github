package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortEmployeeReverseOrderOnBasisOfNameSalaryDate {
	 public static void main(String[] args) {
		 
         Employee1 emp1 = new Employee1("ank", 2000, new Date(2016 - 1900, 11, 14));
         Employee1 emp2 = new Employee1("dav", 500, new Date(2016 - 1900, 11, 23));
         Employee1 emp3 = new Employee1("ank", 1000, new Date(2016 - 1900, 11, 22));
         Employee1 emp4 = new Employee1("sam", 9000, new Date(2016 - 1900, 11, 29));
         Employee1 emp5 = new Employee1("ank", 1000, new Date(2016 - 1900, 11, 19));

         List<Employee1> l = new ArrayList<Employee1>();
         l.add(emp1);
         l.add(emp2);
         l.add(emp3);
         l.add(emp4);
         l.add(emp5);

         Collections.sort(l); // SORT

         System.out.println(l); // Display list

  }

}

