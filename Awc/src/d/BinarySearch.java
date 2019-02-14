package d;

public class BinarySearch {
	int x ;
	public int search(int arr[],int i) {
		 
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==i) {
			return j;
		}
		}	
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch h=new BinarySearch();
      int arr[]= {44,25,36,78,10,3,4,8,27,30};
		System.out.println(h.search(arr, 30));
	}

}
