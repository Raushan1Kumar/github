package Threading;

public class Th implements Runnable{
public void run() {
	System.out.println("hey");
}
	public static void main(String[] args) {
	    ThreadGroup tg= new ThreadGroup("Parent ThreadGroup"); 
		Th h=new Th();
		Thread t=new Thread(tg,h,"one");
        t.start();
        Thread t2=new Thread(tg,h,"two");
        t2.start();
        tg.list();
	}

}
