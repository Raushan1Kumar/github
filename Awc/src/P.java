import java.util.HashSet;

public class P {
	
	
	public static void main(String[] args) {
		int arr[]= {4,7,8,9,8,5,7};
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(h.add(arr[i])==false) {
				System.out.print(arr[i]+" ");
			}
		}
		
		int i=1_7_8;
		int j=8;
		System.out.println("Raushan");
		System.out.println(i+j);
	}
	

}
