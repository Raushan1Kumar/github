
public class Test {
static int count=0;
static char c;
	public static void main(String[] args) {
	String s="My name is raushan.kumar we are live in Delhi";
	for(int i=0;i<s.length();i++) {
		 c=s.charAt(i);
		if(c=='a' || c=='A' ||c=='e' || c=='E'||c=='i' || c=='I'||c=='o' || c=='O'||c=='u' || c=='U')
		count++;
		}
		
	
	System.out.print("Number of Space :" + count +" ");
	}

}
