package d;

import java.util.ArrayList;


public class TwoDArraytoOneD {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
				
		int arr[][]= {{7,9,6},{2,3,4},{5,3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" "); 
				
				a.add(arr[i][j]);
				
			}
			System.out.println();
			
		}
		System.out.println("Two D Two One D");
		for(int l:a){
			System.out.print(l+" ");
		}
      
	} 

}
