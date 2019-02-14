
public class MaxmumArray {

	public static void main(String[] args) {
		int arr[]= {7,8,9,10,12};
		
		int l=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(l<arr[i]) {
				l=arr[i];
			}
			
			
		}
		System.out.println("  maax is :"+l);

	}

}
