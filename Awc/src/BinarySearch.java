import java.util.*;

public class BinarySearch{

	public static void main(String[] args) {
		int a[]= {22,33,47,55,66,44};	
		
	System.out.println("Element at Index no. :"+search(a,44));
	
	
	}
	public static int search(int[] a,int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return-1;
	}

}
