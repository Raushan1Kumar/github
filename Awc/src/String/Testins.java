package String;

public class Testins {
	public static void sort(int arr[]) {
     int n=arr.length;
    for(int i=1;i<n;i++) {
    int key=arr[i];
    int j=i-1;
    while((j>-1)&&(arr[j]>key)) {
    	arr[j+1]= arr[j];
    	j--;
    }
    arr[j+1]=key;
    }
	}
	public static void main(String[] args) {
		int arr[]= {7,8,2,4,3,5,10};
		sort(arr);
		System.out.println("Sorted Array is :");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
