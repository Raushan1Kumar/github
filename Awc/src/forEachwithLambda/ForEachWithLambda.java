package forEachwithLambda;

import java.util.ArrayList;

import Reflection.A;

public class ForEachWithLambda {
public static void main(String[] args) {
	ArrayList<String> lt=new ArrayList<String>();
	lt.add("raushan");	
	lt.add("boby");
	lt.add("aarti");
	lt.forEach(array->System.out.println(array));
}

}
