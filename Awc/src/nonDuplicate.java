
public class nonDuplicate {
static int flag=0,count=0;
	public static void main(String[] args) {
		int arr[]= {7,8,6,2,7,8};
    for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		if(i!=j) {
		if(arr[i]!=arr[j]) {
				flag=1;
			}else {
				flag=0;
				break;
			}
		}
	}if(flag==1) {
		count++;
		System.out.print(arr[i]+" ");
	}
}
    System.out.println("");
    System.out.println(count+" ");
	}

}
