import java.util.HashSet;

public class NonRepated {

	public static void main(String[] args) {
		int count=0;
		int count1=0;
		int arr[]= {7,8,6,5,4,7,2,4};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hs.add(arr[i])==true) {
				//System.out.print(arr[i]+" ");
				count++;
			}
		}
		HashSet<Integer> hs1=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hs1.add(arr[i])==false) {
				//System.out.print(arr[i]+" ");
				count1++;
			}
		}
		System.out.println("total non repeated element :"+(count-count1));
	}

}
