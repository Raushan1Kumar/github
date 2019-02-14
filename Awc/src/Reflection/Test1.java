package Reflection;

import java.util.Scanner;

public class Test1 {

	int a,b;
	int[][]size;
	Scanner sc=new Scanner(System.in);

	public void setSizeOfArray()
	{
		System.out.println("enter the size of array #1:");
		a=sc.nextInt();
		System.out.println("enter the size of array#2:");
		b=sc.nextInt();
		size=new int[a][b];
		
	}
	public void insertData()
	{
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.setSizeOfArray();
		t.insertData();
	}
	
	

}
