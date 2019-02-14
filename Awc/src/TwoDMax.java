
public class TwoDMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][]= {{1,4,7},{7,9,6},{12,10,11}};
      int a=arr[0][0];
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  if(arr[i][j]>a) {
    			  a=arr[i][j];
    		  }
    		  
    	  }
    	  
      }
      System.out.println(a);
	}

}
