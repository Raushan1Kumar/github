
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,10,5,78,35,45,65};
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  if(arr[i]<arr[j]) {
    		  int temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
    	  }
    		  
    	  }
    	  }
    	  for(int k=0;k<arr.length;k++) {
    		  System.out.print(arr[k]+" ,");
    	  }
      }
	}


