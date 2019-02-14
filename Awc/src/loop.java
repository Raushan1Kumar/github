import java.util.Scanner;

public class loop extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		System.out.println("Enter any number:");
		int m=sc.nextInt();
		if(n==1) {
			inner :if(m==3) {
				System.out.println("hellooooo");
				n++;
				m++;
				break inner;
			}
		}
		if(n==2) {
			if(m==4) {
				System.out.println("heyyyyyyy");
			}}
	}
	

	public static void main(String[] args) {
		
		loop l=new loop();
		l.start();
		
			
			}
		}

	


