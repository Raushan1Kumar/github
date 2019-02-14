package notepade;

import java.util.LinkedList;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		LinkedList<Integer> l1=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		int k=sc.nextInt();
		System.out.println("Enter Second Number");
		
		int k1=s.nextInt();
		//System.out.println("Factor of Number is given below");
		for(int i=1;i<=k;i++) {
			if(k%i==0) {
				l.add(i);
				System.out.print(i+" ");
				
			}
			}
		System.out.println(" ");
		for(int j=1;j<=k1;j++) {
			if(k1%j==0) {
				l1.add(j);
				System.out.print(j+" ");
			}
		}
		System.out.println(" ");
		l.retainAll(l1);
		System.out.println(l);
		}

	}


