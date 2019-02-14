import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		int count=0;
		int arr[]= {1,2,4,2,3,6,8,8};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0; i<arr.length;i++) {
			if(hs.add(arr[i])==false){
				System.out.print(arr[i]+" ,");
				count++;
			}
			System.out.println();
		}
       System.out.println(count);
	}

}
