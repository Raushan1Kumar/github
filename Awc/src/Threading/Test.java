package Threading;

public class Test extends Thread {
public void run() {
	for(int i=0;i<=10;i++) {
	try {
		Thread.sleep(500);
	System.out.println(i);
}catch(InterruptedException e) {
	System.out.println(e);
}}}
	public static void main(String[] args) {
Thread t3=new Thread();		
Test t=new Test();
Test t1=new Test();
Test t2=new Test();
t2.setName("Raushan");
t3.start();
System.out.println("Name of Thread "+t2.getName());
t2.start();
try {
	t2.join();
}catch(Exception e) {
	System.out.println(e);
}
t1.start();
System.out.println("-------------------------------");
t.start();
	}

}
