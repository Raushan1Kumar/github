
public class Inter1 {

	public static void main(String[] args) {
		int arr[]= {4,5,8,9};
		int ar[]= {7,4,5,2};
		int m=arr.length;
		int n=ar.length;
		int i=0;
		int j=0;
		while( i<m &&  j<n) {
			if(arr[i]<ar[j]) 
				i++;
				else if  (ar[j]<arr[i] )
				j++;
				else {
				     System.out.print(ar[j++]+" ");
			          i++;
				}
			
		}

	}

}
