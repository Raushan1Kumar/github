
public class LCM_HCF {

	public static void main(String[] args) {
	int a,b,x,y,t,lcm,hcf;
	a=10;
	b=15;
	x=a;
	y=b;
	while(b!=0) {
		t=b;
		b=a%b;
		a=t;
	}
	hcf=a;
	lcm=(x*y)/hcf;
	
    System.out.println("hcf :"+hcf);
    System.out.println("lcm :"+lcm);
	}
	

}
